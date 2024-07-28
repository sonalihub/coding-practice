package com.codingpractice.collection;

import java.util.HashMap;
import java.util.Map;

public class NullKeyValue {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put(null, null);

        System.out.println("Hashmap allows null key and values: "+ map);
    }
}
