package com.example.events.listener;

import org.springframework.context.event.EventListener;

import com.example.events.StateConnectivityEvent;
import com.example.events.StateStatusEvent;

public class StateNotifier {
    
    
    @EventListener
    public void processChangeStatus(StateStatusEvent event) {
	System.out.println(event.getName() + " - " + event.getStatus());
    }
    
    @EventListener
    public void processChangeConnectivity(StateConnectivityEvent event) {
	System.out.println(event.getName() + " - " + event.getConnectivity());
    }
    
}
