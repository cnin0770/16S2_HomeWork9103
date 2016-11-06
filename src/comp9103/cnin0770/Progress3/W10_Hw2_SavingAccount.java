package comp9103.cnin0770.Progress3;

/**
 * Created by cnin0770 on 12/10/16.
 */

/**
 * An account that earns interest at a fixed rate.
 */
public class W10_Hw2_SavingAccount extends W10_Hw2_BankAccount{
    /**
     * Constructs a bank account with a given interest rate.
     *
     * @param rate
     *            the interest rate
     */
    public W10_Hw2_SavingAccount() {}

    public W10_Hw2_SavingAccount(double rate) {
        interestRate = rate;
    }

    /**
     * Adds the earned interest to the account balance.
     */
    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }

    public double getInterestRate() {
        return interestRate;
    }

    private double interestRate;
}
