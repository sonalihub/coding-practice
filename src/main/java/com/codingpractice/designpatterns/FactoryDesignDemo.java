package com.codingpractice.designpatterns;

import org.springframework.beans.factory.annotation.Autowired;

public class FactoryDesignDemo {
@Autowired

    public static void main(String[] args) {
    EngineFactory engineFactory=new EngineFactory();
        Engine bmwEngine=engineFactory.getEngine("BMW");

        //call display of BMW engine
        System.out.println(bmwEngine.display());

        Engine audiEngine = engineFactory.getEngine("AUDI");

    System.out.println( audiEngine.display());



    }
}
