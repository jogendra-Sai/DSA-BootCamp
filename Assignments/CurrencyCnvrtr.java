package Day1_Assignments;

import java.util.Scanner;

public class CurrencyCnvrtr {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter in rupees: ");
        float rupee = input.nextFloat();
        double usd= (rupee/79.5);
        System.out.println("Your amount in USD is : "+usd);

    }
}
