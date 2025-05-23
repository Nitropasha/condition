package org.dzhioev.rest.practice.service.impl;

import org.dzhioev.rest.practice.service.FooBarInterface;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(
        name = "app.what",
        havingValue = "foo",
        matchIfMissing = true
)
public class FooInterfaceImpl implements FooBarInterface {
    public FooInterfaceImpl() {
        System.out.println("FooInterfaceImpl created");
    }

    @Override
    public String print() {
        return "Foo";
    }
}