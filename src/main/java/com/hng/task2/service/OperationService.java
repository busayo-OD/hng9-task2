package com.hng.task2.service;

//import com.hng.task2.slackUser.model.Operation;
//import com.hng.task2.slackUser.model.Response;
//
//import com.hng.task2.slackUser.model.operationType;
import com.hng.task2.model.Operation;
import com.hng.task2.model.Response;
import com.hng.task2.model.operationType;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import  com.google.gson.GsonBuilder;
import java.io.IOException;

@Service
public class OperationService {

    public Response compute(Operation operation){
        Integer resultVal;
        //String operationVal = operationType.getDisplayName();
        operationType optype = operation.getOperation_type();
        Integer x = operation.getX();
        Integer y = operation.getY();
        System.out.println("Int x: " + x);
        System.out.println("Int y: " + y);
        System.out.println("Incoming => operationType: " + optype.getDisplayName());
        if(optype.ADDITION.getDisplayName().equals(optype.getDisplayName())) {
            resultVal =  x + y;
        } else if(optype.SUBTRACTION.getDisplayName().equals(optype.getDisplayName())){
            resultVal =  x - y;
        } else  if (optype.MULTIPLICATION.getDisplayName().equals(optype.getDisplayName())){
            resultVal =  x * y;
        }  else {
            resultVal = 0;
        }
        String slackUsername = "Busayo Dada";
//        Integer result = resultVal;
        String operation_type = optype.getDisplayName();
        Response response = new Response();
        response.setSlackUsername(slackUsername);
        response.setResult(resultVal);
        response.setOperation_type(operation_type);

//        GsonBuilder builder = new GsonBuilder();
//        builder.setPrettyPrinting();
//        Gson gson = builder.create();
//        String jsonString = gson.toJson(response);
////        ObjectMapper Obj = new ObjectMapper();
////        String jsonStr = null;
////        try{
////            jsonStr = Obj.
////            ;
////        } catch (IOException ex){
////            System.out.println(ex.getMessage());
////        }
        return response;
    }



}

