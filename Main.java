import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double myInterest = input.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        int myYears = input.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95: ");
        double myLoanAmt = input.nextDouble();

        Loan myLoan = new Loan(myInterest, myLoanAmt, myYears);

        System.out.println("The loan was created on " + myLoan.getLoanDate());
        System.out.printf("The monthly payment is %.2f\n", myLoan.getMonthlyPayment());
        System.out.printf("The total payment is %.2f\n", myLoan.getTotalPayment());
    }
}
