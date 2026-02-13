package com.mycomp.demoapp.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.mycomp.demoapp.pojo.AdditionRequest;
import com.mycomp.demoapp.pojo.AdditionResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class AdditionServiceImpl implements AdditionService {
   
    private final Random random ;
	
    @Override
    public AdditionResponse addNumbers(AdditionRequest request) {

        log.info("Inside AdditionServiceImpl.addNumbers() method with request: {}", request);
        int randomNum = random.nextInt(100);
        log.info("Generated random number: {}", randomNum);
        
        int sum = request.getNum1() + request.getNum2() + randomNum;
        log.info("Calculated sum: {}", sum);

        return new AdditionResponse(sum);
    }
}
