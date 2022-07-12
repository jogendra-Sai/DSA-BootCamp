package Day1_Assignments;

import java.util.Scanner;

public class PrintLargeNum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter First number: ");
        int num1= input.nextInt();
        System.out.print("Enter Second number: ");
        int num2= input.nextInt();
        if (num1>num2){
            System.out.println("The largest number is: "+num1);
        }
        else{
            System.out.println("The largest number is: "+num2);
        }
    }
}
