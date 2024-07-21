package com.codingpractice.designpatterns;

import org.springframework.stereotype.Component;

@Component
public class BMW implements Engine{
    @Override
    public String display() {
        return "BMW engine";
    }
}
