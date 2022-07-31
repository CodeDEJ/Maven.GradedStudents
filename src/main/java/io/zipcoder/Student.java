package io.zipcoder;

import java.util.ArrayList;

public class Student {

    public String firstName;
    public String lastName;
    public ArrayList<Double> examScores = new ArrayList<>();


    private Double[] testScores = new Double[0];

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

    public ArrayList<Double> getExamScore() {
        return examScores;
    }

    public void setExamScores(ArrayList<Double> examScores) {
        this.examScores = examScores;
    }

    public Double[] getTestScores() {
        return testScores;
    }

    public Integer getNumberOfExamsTaken() {
        return examScores.size();
    }

    public String getExamScores(){
        String scores = new String();
        for (int i = 0; i < examScores.size(); i++){
            scores += String.valueOf("Exam " + (i+1) + " -> " + examScores.get(i) + "\n");
        }
        return scores;
    }

    public String addExamScore(double examScore){
        examScores.add(examScore);
        System.out.println("Exam " + examScores.size() + " -> " + examScore);
        return "Exam " + examScores.size() + " -> " + examScore;
    }

    public String setExamScore(int examNumber, double newScore){
        examScores.add(examNumber,newScore);
        return getExamScores();
    }

    public Double getAverageExamScore(){
        double examSum = 0;
        for (int i = 0; i < examScores.size(); i++){
            examSum += examScores.get(i);
        }
        return  examSum/getNumberOfExamsTaken();
    }
    @Override
    public String toString() {
//        System.out.println("Student Name: " + firstName + " " +lastName + "\n" +
//                "> Average Score " + getAverageExamScore() + "\n" +
//                "> Exam Scores:\n"+
//                getExamScores());
        return  "\nStudent Name: " + firstName + " " + lastName + "\n" +
                "> Average Score " + getAverageExamScore() + "\n" +
                "> Exam Scores:\n"+
                getExamScores();

    }


}
