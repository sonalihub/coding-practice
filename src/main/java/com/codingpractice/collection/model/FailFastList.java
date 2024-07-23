package com.codingpractice.collection.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastList {
    public static void main(String[] args) {
        /**
         * when you try to modify a list while iterating it, it throws Concurrent modification exception.
         * iternally
         */
        List<String> list =new CopyOnWriteArrayList<>();
        list.add("a");
        list.add("b");

        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            String element=iterator.next();
            System.out.println(element);
            //c will not be printed as when the mod count does not match the expected mod count,
            // it creates a copy of a new arraylist and stores the c with the other items.
            //so as of now the current list contains only a and b.
            list.add("c");
        }
    }
}
