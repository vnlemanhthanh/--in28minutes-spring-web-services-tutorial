/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.in28minutes.rest.webservices.restfullwebservices.helloworld;

public class HelloWorldBean {
    private String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "\nHelloWorldBean{" + "message='" + message + '\'' + '}';
    }
}
