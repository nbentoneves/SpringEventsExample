package com.example.events;

import org.springframework.context.ApplicationEvent;

public class EmailEvent extends ApplicationEvent {
    
    
    private static final long serialVersionUID = 5490979325140581811L;
    
    private String message;
    
    private int processTime;
    
    public EmailEvent(Object source) {
	super(source);
    }
    
    /**
     * @return the message
     */
    public String getMessage() {
	return message;
    }
    
    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
	this.message = message;
    }
    
    /**
     * @return the processTime
     */
    public int getProcessTime() {
	return processTime;
    }
    
    /**
     * @param processTime the processTime to set
     */
    public void setProcessTime(int processTime) {
	this.processTime = processTime;
    }
    
    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Id message received: " + message;
    }
    
}
