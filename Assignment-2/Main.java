
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("\n----- Student Information -----");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        if (age >= 18) {
            System.out.println("Status: You are 18 or older.");
        } else {
            System.out.println("Status: You are under 18.");
        }

        input.close();
    }
}
