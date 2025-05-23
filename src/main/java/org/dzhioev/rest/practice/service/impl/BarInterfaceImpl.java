package org.dzhioev.rest.practice.service.impl;

import org.dzhioev.rest.practice.service.FooBarInterface;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "app.what", havingValue = "bar")
public class BarInterfaceImpl implements FooBarInterface {
    public BarInterfaceImpl() {
        System.out.println("BarInterfaceImpl created");
    }
    @Override
    public String print() {
        return "Bar";
    }
}
