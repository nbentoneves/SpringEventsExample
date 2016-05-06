package com.example.events.services;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.example.events.EmailEvent;
import com.example.events.entity.EmailEntity;

@Service
public class EmailService {
    
    
    private volatile boolean runningService = true;
    
    private Queue<EmailEvent> eventQueue = new LinkedBlockingQueue<>();
    
    @Autowired
    private ApplicationEventPublisher publisher;
    
    public void addEventQueue(EmailEntity email) {
	
	EmailEvent event = new EmailEvent(this);
	event.setMessage(email.getMessage());
	event.setProcessTime(email.getProcessTime());
	
	eventQueue.add(event);
	
    }
    
    public void publisherEvents() {
	
	Thread publishEmailEvents = new Thread(new Runnable() {
	    
	    
	    @Override
	    public void run() {
		
		while (runningService) {
		    
		    EmailEvent event = eventQueue.poll();
		    
		    if (event != null) {
			publisher.publishEvent(event);
		    }
		    
		}
	    }
	}, "PublisherEvents");
	
	publishEmailEvents.start();
	
    }
    
    public void stopService() {
	this.runningService = false;
    }
    
}
