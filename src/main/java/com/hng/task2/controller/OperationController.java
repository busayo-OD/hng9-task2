package com.hng.task2.controller;

//import com.hng.task2.slackUser.model.Operation;
//import com.hng.task2.slackUser.model.operationType;
//import com.hng.task2.slackUser.service.OperationService;
import com.hng.task2.model.Operation;
import com.hng.task2.model.Response;
import com.hng.task2.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/operation")
public class OperationController {

    private OperationService operationService;

    @Autowired
    public OperationController(OperationService operationService){
        this.operationService = operationService;
    }

//    @PostMapping
//    public Integer compute(@RequestBody operation_type operationType, Integer x, Integer y){
//        return operationService.compute( operationType, x, y);
//    }

    @PostMapping
    public Response compute(@RequestBody Operation operation){
        return operationService.compute(operation);
    }

}

