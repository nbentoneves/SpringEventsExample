package com.example.events.init;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.example.events.rest.EventsWS;

/**
 * Start the WebService REST
 *
 * @author nuno.bento@ceiia.com
 */
@ApplicationPath("/")
public class InitRest extends ResourceConfig {
    
    /**
     * Constructor
     */
    public InitRest() {
	
	register(EventsWS.class);
	
    }
    
}
