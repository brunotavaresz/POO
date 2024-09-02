package aula11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gradebook {
    private List<Student> students;

    public Gradebook() {
        students = new ArrayList<>();
    }

    public void load(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split("\\|");

                String name = parts[0];
                double grade1 = Double.parseDouble(parts[1]);
                double grade2 = Double.parseDouble(parts[2]);
                double grade3 = Double.parseDouble(parts[3]);

                List<Double> grades = new ArrayList<>();
                grades.add(grade1);
                grades.add(grade2);
                grades.add(grade3);

                Student student = new Student(name, grades);
                students.add(student);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                students.remove(student);
                return;
            }
        }

        System.out.println("Student not found: " + name);
    }

    public double calculateAverageGrade(String name) {
        Student student = getStudent(name);

        if (student == null) {
            return -1;
        }

        List<Double> grades = student.getGrades();
        IGradeCalculator calculator = new SimpleGradeCalculator();
        return calculator.calculate(grades);
    }

    public void printAllStudents() {
        for (Student student : students) {
            System.out.println(student.getName() + " - Grades: " + student.getGrades() + " - Average Grade: "
                    + calculateAverageGrade(student.getName()));
        }
    }
}