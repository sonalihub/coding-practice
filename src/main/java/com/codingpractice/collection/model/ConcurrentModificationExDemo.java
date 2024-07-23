package com.codingpractice.collection.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExDemo {
    public static void main(String[] args) {
        /**
         * when you try to modify a list while iterating it, it throws Concurrent modification exception.
         * iternally
         */
        List<String> list =new ArrayList<>();
        list.add("a");
        list.add("b");

        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            String element=iterator.next();
            System.out.println(element);
            list.add("c");
        }
    }
}
