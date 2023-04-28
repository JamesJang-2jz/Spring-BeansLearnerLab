package com.example;

import java.util.Iterator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        Students current = new Students();
        for (Iterator<Student> iterator = current.iterator(); iterator.hasNext();) {
            Student student = iterator.next();
            current.add(student);
        }
        return current;
        // Students current = new Students();
        // return current.personList.findAll();
    }

    @Bean(name = "previousStudents")
    public Students previousStudents(){
        return
    }

}
