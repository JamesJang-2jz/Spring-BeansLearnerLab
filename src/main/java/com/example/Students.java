package com.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Students extends People<Student> {

    @Override
    public Iterator<Student> iterator() {
        return personList.iterator();
    }

    public Students(Student... students) {
        super(Arrays.asList(students));
    }
}
