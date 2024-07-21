package com.codingpractice.collection;

import com.codingpractice.collection.model.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        Student s1=new Student(1,"Sonu");
        Student s2=new Student(5,"Sunny");
        Student s3=new Student(2,"Nishanth");
        List<Student> students=new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        //printing before sorting
        System.out.println("before sorting: "+ students);

        Collections.sort(students);

        //printing after sorting
        System.out.println("after sorting: "+ students);
    }
}
