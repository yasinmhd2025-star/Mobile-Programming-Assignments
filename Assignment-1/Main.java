
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get student information
        System.out.println("===== Student Registration =====");

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student age: ");
        int age = input.nextInt();

        // Store and display information
        System.out.println("\n===== Student Information =====");

        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);

        System.out.println("\nInformation saved successfully!");

        input.close();
    }
}

