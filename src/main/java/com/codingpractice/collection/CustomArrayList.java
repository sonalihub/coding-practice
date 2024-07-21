package com.codingpractice.collection;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayList extends ArrayList {
    @Override
    public boolean add(Object o) {
        if (this.contains(o)){
            return true;
        }
        else {
            return super.add(o);
        }
    }

    public static void main(String[] args) {
        CustomArrayList nonDuplicatedList=new CustomArrayList();
        nonDuplicatedList.add("Sunny");
        nonDuplicatedList.add("Sonu");
        nonDuplicatedList.add("Sonu");

        nonDuplicatedList.stream().forEach(e->System.out.println(e));
    }
}
