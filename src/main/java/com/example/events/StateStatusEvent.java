package com.example.events;

import org.springframework.context.ApplicationEvent;

public class StateStatusEvent extends ApplicationEvent {
    
    
    private static final long serialVersionUID = 297633366949512857L;
    
    private String name;
    
    private String status;
    
    public StateStatusEvent(Object source) {
	super(source);
    }
    
    /**
     * @return the name
     */
    public String getName() {
	return name;
    }
    
    /**
     * @param name the name to set
     */
    public void setName(String name) {
	this.name = name;
    }
    
    /**
     * @return the status
     */
    public String getStatus() {
	return status;
    }
    
    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
	this.status = status;
    }
    
    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "StateStatusEvent [name=" + name + ", status=" + status + "]";
    }
    
}
