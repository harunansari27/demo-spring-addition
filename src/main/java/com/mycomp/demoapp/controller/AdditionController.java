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


			// add @Autowired for AdditionService
			// field injection for AdditionService
			
			// add MyService and ApplicationContext as fields
    private final AdditionService additionService;
		private MyService myService;
		private final ApplicationContext applicationContext;
	
	// constructor injection for MyService and ApplicationContext
	// public AdditionController( MyService myService, ApplicationContext applicationContext , AdditionService additionService) {
		
	// 	// log the injected dependencies
	// 	logger.info("*** AdditionController initialized.");
	// 	logger.info("MyService instance: {}", myService);
	// 	logger.info("ApplicationContext instance: {}", applicationContext);
	// 	logger.info("AdditionService instance: {}", additionService);

	// 	// assign the injected dependencies to the class fields
	// 	this.myService = myService;
	// 	this.additionService = additionService;
	// 	this.applicationContext = applicationContext;
	// }

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
    	
    	// dependency lookup
    	myService = applicationContext.getBean(MyService.class);
    	logger.info("Using Depedency Lookup Value MyService: {}", myService);
    	
    	String message = myService.myMethod();
		logger.info("Message from MyService: {}", message);

    	return additionService.addNumbers(request);
    }
}
