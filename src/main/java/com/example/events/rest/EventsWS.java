package com.example.events.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.events.entity.EmailEntity;
import com.example.events.services.EmailService;
import com.example.events.services.StateService;

/**
 * End point for WebService REST
 *
 * @author nuno.bento@ceiia.com
 */
@Path("/rest")
public class EventsWS {
    
    
    @Autowired
    private StateService assetService;
    
    @Autowired
    @Qualifier(value = "EmailService")
    private EmailService emailService;
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getHello(EmailEntity request) {
	
	//assetService.changeAssetStatus("PT-MAI-C-01", "Idle");
	
	assetService.changeConnectivity("PT-MAI-C-02", "Offline");
	
	emailService.addEventQueue(request);
	
	return Response.ok().entity(request.getMessage()).build();
    }
    
}
