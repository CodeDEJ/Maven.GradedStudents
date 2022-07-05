package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores = new ArrayList<Double>();

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores() {
        String grades = examScores.toString();
        return grades;
    }

    public int getNumberOfExamsTaken() {
        return examScores.size();
    }

    public void addExamScore(double score) {
        examScores.add(score);
    }

    public void setExamScore(int examNum, double newScore){
        examScores.set(examNum, newScore);
    }

    public double getAverageExamScore(){
        double total = 0;
        for(int i = 1; i < examScores.size(); i++){
            total += examScores.get(i);
        }
        return total/examScores.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", examScores=" + examScores +
                '}';
    }
}