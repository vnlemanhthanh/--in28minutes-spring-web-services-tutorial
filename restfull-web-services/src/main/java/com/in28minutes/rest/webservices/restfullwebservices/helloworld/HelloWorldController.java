/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.in28minutes.rest.webservices.restfullwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }
}
