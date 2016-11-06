package comp9103.cnin0770.Progress3;

/**
 * Created by cnin0770 on 12/10/16.
 */

/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */
public class W10_Hw2_BankAccount {
    /**
     * Constructs a bank account with a zero balance.
     */
    public W10_Hw2_BankAccount() {
        balance = 0;
    }

    /**
     * Constructs a bank account with a given balance.
     * @param initialBalance
     *  the initial balance
     */
    public W10_Hw2_BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    /**
     * Deposits money into the bank account.
     * @param amount
     *  the amount to deposit
     */
    public void deposit(double amount) {
        balance = balance + amount;
    }

    /**
     * Withdraws money from the bank account.
     * @param amount
     *  the amount to withdraw
     */
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    /**
     * Gets the current balance of the bank account.
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Transfers money from the bank account to another account
     * @param amount
     *  the amount to transfer
     * @param other
     *  the other account
     */
    public void transfer(double amount, W10_Hw2_BankAccount other) {
        withdraw(amount);
        other.deposit(amount);
    }

    private double balance;
}
