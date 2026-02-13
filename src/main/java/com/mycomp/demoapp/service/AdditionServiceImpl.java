package com.mycomp.demoapp.service;

import org.springframework.stereotype.Service;

import com.mycomp.demoapp.pojo.AdditionRequest;
import com.mycomp.demoapp.pojo.AdditionResponse;

@Service
public class AdditionServiceImpl implements AdditionService {
	
    @Override
    public AdditionResponse addNumbers(AdditionRequest request) {
        int sum = request.getNum1() + request.getNum2();
        return new AdditionResponse(sum);
    }
}
