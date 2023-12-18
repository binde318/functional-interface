package Hello;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal = 0;
        double monthlyInterest = 0;
        int numberOfPayment = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(" Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
                System.out.println("Enter a value between 1000 and 100000");
        }
        while (true) {
            System.out.print(" Annual Interest Rate:");
            double annualInterestRate = scanner.nextDouble();
            if (annualInterestRate >= 1 && annualInterestRate <= 30) {
                monthlyInterest = annualInterestRate / PERCENT / MONTH_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");

        }
        while (true) {
            System.out.print(" Period(Year) ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {

                numberOfPayment = years * MONTH_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }
        System.out.print(" Mortgage ");
        double mortGage = principal * (MONTH_IN_YEAR * Math.pow(1 + MONTH_IN_YEAR, numberOfPayment))
                /(Math.pow(1 + MONTH_IN_YEAR, numberOfPayment) -1);
        String mortgageFormatted= NumberFormat.getCurrencyInstance().format(200.0);
        System.out.println(" Mortgage " + mortgageFormatted);
    }
}
