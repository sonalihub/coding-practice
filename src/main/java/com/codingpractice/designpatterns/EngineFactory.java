package com.codingpractice.designpatterns;

import org.springframework.stereotype.Component;

@Component
public class EngineFactory {

    public Engine getEngine(String engineType){
        if(engineType==null)return null;

      else  if(engineType.equalsIgnoreCase("BMW")) return new BMW();

        else  if(engineType.equalsIgnoreCase("AUDI")) return new Audi();

        return null;
    }
}
