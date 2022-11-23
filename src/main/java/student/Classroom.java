package student;

import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {


    ArrayList<Student> students = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);

        Student student = new Student("Peter Smith", 7, 1);
        Student student1 = new Student("John Miller", 4,2);
        Student student2 = new Student("Jane McGyver", 2, 3);
        Student student3 = new Student("Lia Hoffner", 8, 4);

    public void setStudents() {
        students.add(student1);
        students.add(student);
        students.add(student2);
        students.add(student3);
    }

    public void listStudents(){
        System.out.println("Listing all the students in the classroom: \n ");

        for (Student student: students){
            System.out.println("Name " + student.name + " Course : " + student.course);
        }
    }

    public void findStudentByName(){
        System.out.println("Please insert Name:");
        String name = scanner.nextLine();
        try {
            for (Student student: students) {
                if (student.name.equalsIgnoreCase(name) ) {
                    System.out.println("Name: " + student.name + " Course: " + student.course);
                    return;
                }
            }
        }catch (Exception ex){
            System.out.println("Unable to find Student. Please try again");
        }
    }

    public void removeStudent(){
        System.out.println("Please enter the name of the student to remove");
        String name = scanner.nextLine();
        for(Student student: students) {
            if (student.name.equalsIgnoreCase(name)){
                int index = students.indexOf(student);
                students.remove(student);
                System.out.println(student.name + " has been removed successfully");
                return;
            }

        }
        System.out.println("Unable to find student. Please try again");
    }
    public void findStudentUnder5() {
        try {
            for (Student student: students) {
                if (student.grade <= 5) {
                    System.out.println("Name: " + student.name + " Grade " + student.grade);
                }
            }
        } catch (Exception ex) {
            System.out.println("No students with grade under 5");
        }
    }

    public void findStudentOver5() {
        try {
            for (Student student: students) {
                if (student.grade >= 5) {
                    System.out.println("Name: " + student.name + " Grade " + student.grade);
                }
            }
        } catch (Exception ex) {
            System.out.println("No students with grade over 5");
        }
    }
    public void addStudent(){
        System.out.println("Please enter student name");
        String name = scanner.nextLine();

        System.out.println("Please enter the grade of the student:");
        int grade = intScanner.nextInt();

        System.out.println("Please enter the course:");
        int course = intScanner.nextInt();

        Student student = new Student(name,grade,course);

        students.add(student);
        System.out.println(name + " added successfully!");
    }

}
