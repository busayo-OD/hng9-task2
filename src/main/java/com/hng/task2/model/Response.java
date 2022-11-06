package com.hng.task2.model;

public class Response {
    private String slackUsername;
    private Integer result;
    private String operation_type;

    public String getSlackUsername() {
        return slackUsername;
    }

    public void setSlackUsername(String slackUsername) {
        this.slackUsername = slackUsername;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getOperation_type() {
        return operation_type;
    }

    public void setOperation_type(String operation_type) {
        this.operation_type = operation_type;
    }

    public Response(String slackUsername, Integer result, String operation_type) {
        this.slackUsername = slackUsername;
        this.result = result;
        this.operation_type = operation_type;
    }

    public Response() {
    }

    @Override
    public String toString() {
        return "\"Response[slackUsername " + slackUsername + ", result = " + result + ", operation_type = " + operation_type + "]";
    }
}

