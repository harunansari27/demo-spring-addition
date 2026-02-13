package com.mycomp.demoapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyService {
	
	// slf4j logger can be used here for logging
	private static final Logger logger = LoggerFactory.getLogger(MyService.class);
	
	public MyService() {
		logger.info("*** MyService initialized. {}", this);
	}
	
	public String myMethod() {
		logger.info("myMethod called in MyService");
		
		String message = "Calling myMethod from MyService";
		
		logger.info("Message: {}", message);
		return message;
	}

}
