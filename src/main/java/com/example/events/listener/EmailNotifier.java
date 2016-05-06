package com.example.events.listener;

import org.springframework.context.event.EventListener;

import com.example.events.EmailEvent;

public class EmailNotifier {
    
    
    @EventListener
    public void processSendEmail(EmailEvent event) {
	
	try {
	    Thread.sleep(event.getProcessTime());
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	
	System.out.println("Email Message: " + event + " delayed " + event.getProcessTime() + " to process!");
	
    }
    
}
