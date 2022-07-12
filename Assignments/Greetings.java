package Day1_Assignments;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
         String greet= input.nextLine();
        System.out.println("Hello " +greet+ " welcome to DSA course");
    }
}
