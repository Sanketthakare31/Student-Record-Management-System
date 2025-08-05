package com.internship;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // getters and setters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getMarks() { return marks; }

    public void setName(String name) { this.name = name; }
    public void setMarks(double marks) { this.marks = marks; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}

public class StudentManagement {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Student Management Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(in.nextLine());

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter ID: ");
        int id = Integer.parseInt(in.nextLine());
        
        System.out.print("Enter Name: ");
        String name = in.nextLine();
        
        System.out.print("Enter Marks: ");
        double marks = Double.parseDouble(in.nextLine());

        students.add(new Student(id, name, marks));
        System.out.println("Student added successfully.");
    }

    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            System.out.println("\nList of students:");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    private static void updateStudent() {
    	
        System.out.print("Enter student ID to update: ");
        int id = Integer.parseInt(in.nextLine());

        Student s = findStudentById(id);
        if (s == null) {
            System.out.println("Student with ID " + id + " not found.");
            return;
        }

        System.out.print("Enter new name (leave blank to keep \"" + s.getName() + "\"): ");
        String name = in.nextLine();
        if (!name.isBlank()) {
            s.setName(name);
        }

        System.out.print("Enter new marks (leave blank to keep " + s.getMarks() + "): ");
        String marksInput = in.nextLine();
        if (!marksInput.isBlank()) {
            s.setMarks(Double.parseDouble(marksInput));
        }

        System.out.println("Student updated.");
    }

    private static void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        int id = Integer.parseInt(in.nextLine());

        Student s = findStudentById(id);
        if (s == null) {
            System.out.println("No student found with ID " + id);
            return;
        }

        students.remove(s);
        System.out.println("Student removed.");
    }

    private static Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
}