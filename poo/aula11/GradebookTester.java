package aula11;

import java.util.List;
import java.util.ArrayList;

public class GradebookTester {
    public static void main(String[] args) {

        Gradebook gradebook = new Gradebook();

        gradebook.load("alunos.txt");

        Student newStudent = new Student("Johny May", new ArrayList<>(List.of(10.0, 15.0, 19.0)));
        gradebook.addStudent(newStudent);


        gradebook.removeStudent("Jane Smith");


        Student student = gradebook.getStudent("John Doe");


        double averageGrade = gradebook.calculateAverageGrade("John Doe");
        System.out.println("Average grade for John Doe: " + averageGrade);


        gradebook.printAllStudents();
    }
}

