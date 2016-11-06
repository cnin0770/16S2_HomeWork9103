//package comp9103.cnin0770;

import java.util.Scanner;

/** Exercise 1. Interest
 Write a program that reads in three interactive inputs from keyboard by using Scanner class,
 a positive double (principle) and a positive double (interestRate), and the years for term deposit.
 For each year, calculate and print out the year number, the money at the start of the year,
 the interest earned and the total at the end of the year for a given number of years.
 For example, if the user provides interactive input 10000.00 for principle,
 0.05 as interest and 5 as deposit term, then on the display, your code would print:

 Year 1-principle: $10000.00 Interest: $500.00 Total: $10500.00
 Year 2-principle: $10500.00 Interest: $525.00 Total: $11025.00
 */
public class W5_1 {
    public static void main (String[] args) {

        System.out.println("Please give your principle, interest rate and depositing years: ");

        Scanner Input = new Scanner(System.in);
        double prin = Input.nextDouble();
        double rate = Input.nextDouble();
        int yrs = Input.nextInt();

        for (int i = 1; i <= yrs; i++) {
            double prinFrom = Math.pow((rate+1),(i-1)) * prin;
            double prinAfter = Math.pow((rate+1),i) * prin;
            double prinInterest = prinAfter - prinFrom;
            System.out.printf("Year " + i + "-principle: $%.2f Interest: $%.2f Total: $%.2f\n",
                    prinFrom, prinInterest, prinAfter);
            // "Year " + i + "-principle: $" + String.format("%.2f", prinFrom)
            // + " Interest: $" + String.format("%.2f", (prinAfter - prinFrom))
            // + " Total: $" + String.format("%.2f", prinAfter));
        }
    }
}
