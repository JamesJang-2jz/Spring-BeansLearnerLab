package com.example;

import java.util.Arrays;
import java.util.Iterator;

public class Instructors extends People<Instructor> {

    @Override
    public Iterator<Instructor> iterator() {
        return personList.iterator();
    }

    public Instructors(Instructor... instructors) {
        super(Arrays.asList(instructors));
    }

}
