package com.codingpractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class FailFastMap {
    public static void main(String[] args) {
        Map<Integer, String> map=new ConcurrentHashMap<>();
        map.put(1,"one");
        map.put(2,"two");

        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            map.put(3,"three");
        }
    }
}
