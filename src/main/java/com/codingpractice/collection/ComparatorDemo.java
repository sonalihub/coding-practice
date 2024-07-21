package com.codingpractice.collection;

import com.codingpractice.collection.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Comparator is used when we need multiple sorting techniques.
 * This is dynamic and original class need not be changed unlike Comparable
 * Compare method is invoked.
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        {
            Student s1 = new Student(1, "Sonu");
            Student s2 = new Student(5, "Sunny");
            Student s3 = new Student(2, "Nishanth");
            Student s4 = new Student(2,"Naseer");
            List<Student> students = new ArrayList<>();
            students.add(s1);
            students.add(s2);
            students.add(s3);
            students.add(s4);

            //printing before sorting
            System.out.println("before sorting: " + students);

            Collections.sort(students, new NameComparator());
            //after sorting based on name
            System.out.println("after sorting based on name: " + students);

            Collections.sort(students, new IdComparator());

            // after sorting based on id
            System.out.println("after sorting based on id, but if id is same, then sort based on name: " + students);
        }
    }
}
