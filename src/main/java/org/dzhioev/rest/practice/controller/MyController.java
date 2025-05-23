package org.dzhioev.rest.practice.controller;

import org.dzhioev.rest.practice.service.FooBarInterface;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    FooBarInterface fooBarInterface;

    public MyController(FooBarInterface fooBarInterface) {
        this.fooBarInterface = fooBarInterface;
    }

    @GetMapping("/")
    public String hello() {
        return fooBarInterface.print();
    }
}