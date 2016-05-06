package com.example.events;

import org.springframework.context.ApplicationEvent;

public class StateConnectivityEvent extends ApplicationEvent {
    
    
    private static final long serialVersionUID = -4126959533092046026L;
    
    private String name;
    
    private String connectivity;
    
    public StateConnectivityEvent(Object source) {
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
     * @return the connectivity
     */
    public String getConnectivity() {
	return connectivity;
    }
    
    /**
     * @param connectivity the connectivity to set
     */
    public void setConnectivity(String connectivity) {
	this.connectivity = connectivity;
    }
    
    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "StateConnectivityEvent [name=" + name + ", connectivity=" + connectivity + "]";
    }
    
}
