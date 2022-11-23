import student.Classroom;
import student.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Classroom classroom = new Classroom();

        //It was annoying to add students by hand so created a method to add them automatically
        classroom.setStudents();
        System.out.println("Welcome to the classroom.");
        String input = "";
        do{
            System.out.println("""
                    Please select an option:
                    
                    \n
                    1. List Students
                    2. View single student by name
                    3. Remove a student by name
                    4. View students with grade greater than 5
                    5. View students with grade less than 5
                    6. Add student
                    quit - quit the application
                    """);


            input = scanner.nextLine();

            switch (input){
                case "quit":
                    System.out.println("Exiting application");
                    break;
                case "1":
                    classroom.listStudents();
                    break;
                case "2":
                    classroom.findStudentByName();
                    break;
                case "3":
                    classroom.removeStudent();
                    break;
                case "4":
                    classroom.findStudentUnder5();
                    break;
                case "5":
                    classroom.findStudentOver5();
                    break;
                case "6":
                    classroom.addStudent();
                    break;

                default:
                    System.out.println("Please select a valid input");
                    break;
            }
        } while (!input.equalsIgnoreCase("quit"));
    }
}
