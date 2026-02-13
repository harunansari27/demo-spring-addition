package com.mycomp.demoapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycomp.demoapp.pojo.AdditionRequest;
import com.mycomp.demoapp.pojo.AdditionResponse;
import com.mycomp.demoapp.service.MyService;

  @RestController
@RequestMapping("/stripe/webhook")
public class StripeWebHookController {
	
	// add slf4j logger object
	private static final Logger logger = LoggerFactory.getLogger(StripeWebHookController.class);


   @PostMapping
    public String add(@RequestBody String request) {
    	logger.info("Received stripe webhook request: {}", request);
    	
    	
    	return "";

      
    }
}
