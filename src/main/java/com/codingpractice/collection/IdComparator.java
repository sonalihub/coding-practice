package com.codingpractice.collection;

import com.codingpractice.collection.model.Student;
import org.apache.logging.log4j.util.PropertySource;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getId() == s2.getId()) {
            return 0;
        } else if (s1.getId() > s2.getId()) {
            return 1;
        } else {
            return -1;
        }
    }
}
