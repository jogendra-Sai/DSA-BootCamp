package Day1_Assignments;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter principle amount: ");
        float pr= input.nextFloat();
        System.out.print("Please enter Rate: ");
        float rate= input.nextFloat();
        System.out.print("Please enter Intrest: ");
        float intrs= input.nextFloat();
        float result = (pr*rate*intrs)/100;
        System.out.println("The SimpleIntrest is : "+result);

    }
}
