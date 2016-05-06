package com.example.events.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.example.events.StateConnectivityEvent;
import com.example.events.StateStatusEvent;

@Service
public class StateService {
    
    
    @Autowired
    private ApplicationEventPublisher publisher;
    
    public void changeStatus(String name, String status) {
	
	StateStatusEvent event = new StateStatusEvent(this);
	event.setName(name);
	event.setStatus(status);
	
	publisher.publishEvent(event);
	
    }
    
    public void changeConnectivity(String name, String connectivity) {
	
	StateConnectivityEvent event = new StateConnectivityEvent(this);
	event.setName(name);
	event.setConnectivity(connectivity);
	
	publisher.publishEvent(event);
	
    }
    
}
