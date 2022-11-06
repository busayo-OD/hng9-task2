package com.hng.task2.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum operationType {

    ADDITION("addition"),
    SUBTRACTION("subtraction"),
    MULTIPLICATION("multiplication");

    private final String displayName;


    private operationType( String displayName){
        this.displayName = displayName;
    }
    public  String getDisplayName(){
        return  displayName;
    }

    @JsonCreator
    public static operationType getOperationFromCode(String value){
        for (operationType operation_type : operationType.values()){
            if(operation_type.getDisplayName().equals(value.trim())){
                return operation_type;
            }
        }
        return null;
    }

}

