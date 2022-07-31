package io.zipcoder;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    Student s  = new Student("Joseph", "JoStar", new ArrayList<>());
    @Test
    public void addExamScoreTest(){
        double examScore = 96.0;
        String actual = s.addExamScore(examScore);
        String expected = "Exam " + s.examScores.size() + " -> " + examScore;
        Assert.assertEquals("Exam 1 -> 96.0", expected,actual);
    }

    @Test
    public void getAverageExamScoreTest(){
        s.addExamScore(97.0);
        s.addExamScore(99.0);
        Double expected = 98.0;
        Double actual = s.getAverageExamScore();
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void toStringTest(){
        // : Given
        s.firstName = "Joseph";
        s.lastName = "Jostar";
        s.examScores. add(100.0);
        s.examScores. add(150.0);
        s.examScores. add(250.0);
        s.examScores. add(0.0);
        Student student = new Student(s.firstName, s.lastName, s.examScores);

        // When
        String output = student.toString();

        // Then
        System.out.println(output);

    }

}