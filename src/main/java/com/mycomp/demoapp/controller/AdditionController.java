package com.mycomp.demoapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycomp.demoapp.pojo.AdditionRequest;
import com.mycomp.demoapp.pojo.AdditionResponse;
import com.mycomp.demoapp.service.AdditionService;
import com.mycomp.demoapp.service.MyService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/add")
@Slf4j
@RequiredArgsConstructor
public class AdditionController {
	
	// add slf4j logger object
	private static final Logger logger =
		LoggerFactory.getLogger(AdditionController.class);

		// inject the addition service and my service using constructor injection
    private final AdditionService additionService;
		private final MyService myService;
		private final ApplicationContext applicationContext;
	

    @PostMapping
    public AdditionResponse add(@RequestBody AdditionRequest request) {
    	logger.info("Received addition request: {}", request);


			// log a message to indicate that the controller method is working
			log.info("LOg AdditionController.add() method is working for request: {}", request);
    	
    	// using applicationContext print all the spring beans
    	String[] beanNames = applicationContext.getBeanDefinitionNames();
    	logger.info("Available Spring Beans:");
		for (String beanName : beanNames) {
			//logger.info("Bean Name: {}", beanName);
		}
    	
    	String message = myService.myMethod();
		logger.info("Message from MyService: {}", message);

    	return additionService.addNumbers(request);
    }
}
