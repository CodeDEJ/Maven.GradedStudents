package io.zipcoder;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class Classroom {

    int maxNumberOfStudents;
    private Student[] students = new Student[maxNumberOfStudents];

    public Classroom(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom() {
        this(0);
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore() {
        double scores = 0;
        for (int i = 0; i < students.length - 1; i++) {
            scores += students[i].getAverageExamScore();
        }
        double avg = scores / students.length;
        return avg;
    }

    public void addStudent(Student student) {
        ArrayList<Student> betterStudents = new ArrayList<>(Arrays.asList(student));
        for (int i = 0; i < students.length; i++) {
            betterStudents.add(students[i]);
        }
        students = betterStudents.toArray(new Student[maxNumberOfStudents]);
    }

    public Student[] removeStudent(String firstName, String lastName) {
        ArrayList<Student> betterStudents = new ArrayList<>(Arrays.asList(students));
        for (int i = 0; i < betterStudents.size() - 1; i++) {
            if (betterStudents.get(i).getFirstName() == firstName && betterStudents.get(i).getLastName() == lastName) {
                betterStudents.remove(i);
            }
        }
        return students = betterStudents.toArray(new Student[maxNumberOfStudents]);
    }

    public void getStudentsByScore() {
        //ArrayList<Student> betterStudents = new ArrayList<>(Arrays.asList(students));
        Student temp = new Student(null, null, null);
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 1; j < (students.length - i); j++) {
                if (students[j - 1].getAverageExamScore() < students[j].getAverageExamScore()) {
                    temp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    public void getGradeBook() {
        Student temp = new Student("John", "Doe", new ArrayList<>(Arrays.asList(100.0)));
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 1; j < (students.length- i); j++) {
                if (students[j - 1].getAverageExamScore() < students[j].getAverageExamScore()) {
                    temp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = temp;
                }
                String grade = null;
                double max = students[0].getAverageExamScore();
                double min = students[-1].getAverageExamScore();
                double range = max - min;
                List <Student> arr = new ArrayList<Student>();

                for ( int g = 0; g < students.length - 1; g++) {
                    if (students[g].getAverageExamScore() <= max || students[g].getAverageExamScore() > max - (range * .1)) {
                        grade = "A";
                    } else if (max - (range * .11) > students[g].getAverageExamScore() || students[g].getAverageExamScore() > max - (range * .29)) {
                        grade = "B";
                    } else if (max - (range * .30) > students[g].getAverageExamScore() || students[g].getAverageExamScore() > max - (range * .50)) {
                        grade = "C";
                    } else if (max - (range * .51) > students[g].getAverageExamScore() || students[g].getAverageExamScore() > max - (range * .89)) {
                        grade = "D";
                    } else if (max - (range * .11) > students[g].getAverageExamScore()) {
                        grade = "F";
                    }
                    arr.add(students[g]);
                }
            }
        }
    }
}