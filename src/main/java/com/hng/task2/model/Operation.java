package com.hng.task2.model;

public class Operation {


    private operationType operation_type;

    private Integer x;
    private Integer y;



    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public operationType getOperation_type() {
        return operation_type;
    }

    public void setOperation_type(operationType operation_type) {
        this.operation_type = operation_type;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }


    public Operation(operationType operation_type, Integer x, Integer y) {
        this.operation_type = operation_type;
        this.x = x;
        this.y = y;
    }
}

