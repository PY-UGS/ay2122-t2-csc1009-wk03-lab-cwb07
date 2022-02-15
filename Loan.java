import java.lang.Math;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate = new java.util.Date();

    public Loan(double annualInterestRate, double loanAmount, int numberOfYears) {
        this.annualInterestRate = annualInterestRate;
        this.loanAmount = loanAmount;
        this.numberOfYears = numberOfYears;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public java.util.Date getLoanDate() {
        return loanDate;
    }

    public void setAnnualInterestRate(double interestRate) {
        this.annualInterestRate = interestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = (annualInterestRate/100) / 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1-(1/Math.pow(1+monthlyInterestRate, numberOfYears*12)));
        return monthlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }   
}