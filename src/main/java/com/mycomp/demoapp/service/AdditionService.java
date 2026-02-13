package com.mycomp.demoapp.service;

import com.mycomp.demoapp.pojo.AdditionRequest;
import com.mycomp.demoapp.pojo.AdditionResponse;

public interface AdditionService {
    AdditionResponse addNumbers(AdditionRequest request);
}
