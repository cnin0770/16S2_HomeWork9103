package comp9103.cnin0770.Progress3;

import java.util.Scanner;

/**
 * Created by cnin0770 on 12/10/16.
 */
public class W10_Hw2_TermDepositAccount extends W10_Hw2_SavingAccount {
    static int terms = 0;
    final double PENALTY = 100;
    boolean keepTerm = true;

    public W10_Hw2_TermDepositAccount() {}

    public W10_Hw2_TermDepositAccount(double rate, int terms) {
        super(rate);
        this.terms = terms;
    }

    public void addInterest() {
        if (keepTerm) {
            double interest = getBalance() * getInterestRate() / 100;
            super.deposit(interest);
            terms--;
        } else { terms--; }
    }

    public void withdraw(double amount) {
        deposit(amount);
        if (terms > 0 && keepTerm && amount > 0) {
            deposit(PENALTY);  //only penalise once
            keepTerm = false;
        }
    }

    public static void main(String[] args) {
        W10_Hw2_TermDepositAccount tom = new W10_Hw2_TermDepositAccount(50, 6);
        tom.deposit(1500);

        System.out.println("this is a test of tom's bank account, initialise with $1500, 50% interest rate for 6 month deposit." +
                "\neach month you will be asked if you wish to make a withdraw. the deposit term will be broke if you do." +
                "\nand a penalty will apply. interest calculation will also stop. penalty will apply no more than once." +
                "\ninterest calculation starts when you enter 0.");
        Scanner input = new Scanner(System.in);

        while (input.hasNextDouble() && (terms > 1)) {
            System.out.println(terms - 1 + " months left, do you wish to make a deposit? " +
            "enter the amount, if you do not, enter 0: ");

            tom.withdraw(input.nextDouble());
            tom.addInterest();
        }

        double sum = 1500;
        for (int k = 6; k > 0; k--) {
            sum = sum + (sum * (tom.getInterestRate()/100));
        }

        System.out.println("tom's final balance after the term: " + tom.getBalance() +
        "\nif you did not break the term, the balance should be " + sum);
    }
}
