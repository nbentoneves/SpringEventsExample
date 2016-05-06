package com.example.events.entity;

public class EmailEntity {
    
    
    private int processTime;
    
    private String message;
    
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
	return "EmailEntity [message=" + message + "]";
    }
    
}
