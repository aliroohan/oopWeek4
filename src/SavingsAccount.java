public class SavingsAccount {
    static double annualInterestRate;
    private double savingsBalance;

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    void calculateMonthlyInterest() {
        double interest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += interest;
    }
    static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }
}
