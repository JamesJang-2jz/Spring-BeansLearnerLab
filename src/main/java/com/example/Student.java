package com.example;

public class Student extends Person implements Learner {

    double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

}
