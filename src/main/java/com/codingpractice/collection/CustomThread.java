package com.codingpractice.collection;

import java.util.HashMap;
import java.util.Map;

public class CustomThread extends Thread {
    static Map<Integer, String> map = new HashMap<>();

    @Override
    public void run() {

        try {
            sleep(1000);
            map.put(4, "D");
        } catch (InterruptedException e) {
            System.out.println("Child thread is trying to add an element");
        }

    }

    public static void main(String[] args) {
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");

        CustomThread thread=new CustomThread();
        thread.start();

        map.entrySet().stream().forEach(entry -> {
            System.out.println(entry);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Main thread trying to loop");
            }
        });

    }
}
