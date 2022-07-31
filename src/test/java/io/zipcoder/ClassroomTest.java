package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;


public class ClassroomTest {

    @Test
    public void addStudentTest() {
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double> examScores = new ArrayList<>(Arrays.asList(100.0, 150.0, 250.0, 0.0));

        Student student = new Student("Leon", "Hunter", examScores);

        // When
        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);

    }

    @Test
    public void addTwoStudentsTest() {
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double> examScores = new ArrayList<>(Arrays.asList(100.0, 150.0, 250.0, 0.0));
        ArrayList<Double> examScores2 = new ArrayList<>(Arrays.asList(100.0, 150.0, 250.0, 0.0));

        Student student = new Student("Leon", "Hunter", examScores);
        Student student2 = new Student("Jane", "Doe", examScores2);

        // When
        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents();
        classroom.addStudent(student2);
        Student[] biggerClassroom = classroom.getStudents();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);
        String biggerClassroomAsString = Arrays.toString(biggerClassroom);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(biggerClassroomAsString);
    }

    @Test
    public void removeStudentTest() {
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double> examScores = new ArrayList<>(Arrays.asList(100.0, 150.0, 250.0, 0.0));
        ArrayList<Double> examScores2 = new ArrayList<>(Arrays.asList(100.0, 150.0, 250.0, 0.0));

        Student student = new Student("Leon", "Hunter", examScores);
        Student student2 = new Student("Jane", "Doe", examScores2);

        // When
        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents();
        classroom.addStudent(student2);
        Student[] biggerClassroom = classroom.getStudents();
        classroom.removeStudent("Jane", "Doe");
        Student[] smallerClassroom = classroom.getStudents();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);
        String biggerClassroomAsString = Arrays.toString(biggerClassroom);
        String smallerClassroomAsString = Arrays.toString(smallerClassroom);
        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(biggerClassroomAsString);
        System.out.println("===========================");
        System.out.println(smallerClassroomAsString);
    }

    @Test
    public void getStudentsByScoreTest() {
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double> examScores = new ArrayList<>(Arrays.asList(50.0, 75.0, 125.0, 0.0));
        ArrayList<Double> examScores2 = new ArrayList<>(Arrays.asList(100.0, 150.0, 250.0, 0.0));
        ArrayList<Double> examScores3 = new ArrayList<>(Arrays.asList(25.0, 32.5, 75.0, 0.0));

        Student student = new Student("Leon", "Hunter", examScores);
        Student student2 = new Student("Jane", "Doe", examScores2);
        Student student3 = new Student("Sonic", "Hedgehog", examScores3);

        // When
        classroom.addStudent(student3);
        classroom.addStudent(student2);
        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents();
        classroom.getStudentsByScore();
        Student[] sortEnrollment = classroom.getStudents();


        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);
        String sortEnrollmentAsString = Arrays.toString(sortEnrollment);;

        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(sortEnrollmentAsString);
    }

}
