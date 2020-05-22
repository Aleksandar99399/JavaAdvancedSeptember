package DefiningClassLab.bankAccount;

public class BankAccount {
    private static double interestRate = 0.02;
    private static int accountsCount = 0;

    private int id;
    private double balance;

    public BankAccount() {
        BankAccount.accountsCount++;
        this.id = accountsCount;
        this.balance = 0.0;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public Integer getId() {
        return this.id;
    }

    public double getAfterYears(int age) {
        return this.balance * BankAccount.interestRate * age;
    }
}
