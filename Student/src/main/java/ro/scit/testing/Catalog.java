package main.java.ro.scit.testing;


import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

public class Catalog {


    Student student1 = new Student("John Doe", 8);
    Student student2 = new Student("Marry Ann", 9);
    Student student3 = new Student("Alex Luthor", 6);
    Student student4 = new Student("Rose Zoe", 10);

    static ArrayList<Student> Students = new ArrayList<>();

    public void populateCatalog() {
        Students.add(student1);
        Students.add(student2);
        Students.add(student3);
        Students.add(student4);
    }

    public ArrayList<Student> getStudents() {
        return Students;
    }


    public void deleteOldCatalog() {
        File file = new File("C:\\Users\\Mozes Hunor\\Documents\\Project\\Student\\students");
        if (file.delete()) {
            System.out.println("Old catalog successfully deleted!");
        }
    }

    public boolean studentExists(String name) {
        boolean found = false;
        for (Student students : Students) {
            if (Objects.equals(name, students.getName())) {
                found = true;
            }
        }
        if (found) {
            return true;
        } else {
            return false;
        }
    }

    public void changeGradeOfAStudent(String name, double newGrade) {
        boolean found = false;
        for (Student students : Students) {
            if (Objects.equals(name, students.getName())) {
                students.setGrade(newGrade);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student by the name " + name + " does not exist in the catalog!");
        } else {
            System.out.println("Student " + name + "'s grade has been updated!");
        }
    }

    public void addNewStudent(String name, double grade) {
        if (studentExists(name)) {
            System.out.println("Student " + name + " already exists in the catalog!");
        } else {
            Student newStudent = new Student(name, grade);
            Students.add(newStudent);
            System.out.println("New student " + name + " has been added to the catalog!");
        }
    }

    public void readGradeOfStudent(String name) {
        if (studentExists(name)) {
            for (Student students : Students) {
                if (Objects.equals(name, students.getName())) {
                    System.out.println("Student's " + name + " grade is: " + students.getGrade());
                }
            }
        } else {
            System.out.println("Student does not exist!");
        }
    }

    public void deleteGradeOfStudent(String name) {
        if (studentExists(name)) {
            for (Student students : Students) {
                if (Objects.equals(students.getName(), name)) {
                    students.setGrade(0.0);
                }
            }
            System.out.println("Student " + name + "'s grade has been removed!");
        } else {
            System.out.println("Student with " + name + " name does not exist in catalog.");
        }

    }

    public void addGradeToStudent(String name, double grade) {
        boolean alreadyHasGrade = false;
        if (studentExists(name)) {
            for (Student student : Students) {
                if ((Objects.equals(student.getName(), name)) && (student.getGrade() == 0.0)) {
                    student.setGrade(grade);
                    System.out.println(grade + " has been added to " + name + "'s name!");
                } else if ((Objects.equals(student.getName(), name)) && (student.getGrade() > 0.0)) {
                    alreadyHasGrade = true;
                }

            }
        } else {
            System.out.println("Student " + name + " does not exist in catalog!");
        }
        if (alreadyHasGrade) {
            System.out.println("Student " + name + " already has a grade: " + grade);
        }
    }
}



