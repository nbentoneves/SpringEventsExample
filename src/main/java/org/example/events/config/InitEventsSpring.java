package org.example.events.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

import com.example.events.listener.StateNotifier;
import com.example.events.listener.EmailNotifier;
import com.example.events.services.EmailService;

/**
 * Start the Spring context for webhook project
 *
 * @author nuno.bento@ceiia.com
 */
@Configuration
@ComponentScan(value = { "com.example.events.*" })
public class InitEventsSpring {
    
    
    //HELP: http://www.baeldung.com/spring-events
    @Bean(name = "applicationEventMulticaster")
    public ApplicationEventMulticaster simpleApplicationEventMulticaster() {
	
	SimpleApplicationEventMulticaster multicasterEvents = new SimpleApplicationEventMulticaster();
	
	multicasterEvents.setTaskExecutor(new SimpleAsyncTaskExecutor());
	return multicasterEvents;
    }
    
    @Bean(name = "AssetNotifier")
    public StateNotifier assetNotifier() {
	return new StateNotifier();
    }
    
    @Bean(name = "EmailNotifier")
    public EmailNotifier emailNotifier() {
	return new EmailNotifier();
    }
    
    @Bean(name = "EmailService")
    public EmailService emailService() {
	
	EmailService service = new EmailService();
	service.publisherEvents();
	
	return service;
	
    }
    
}
