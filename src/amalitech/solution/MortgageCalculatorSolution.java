package amalitech.solution;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MortgageCalculatorSolution {
    public static void main(String[] args) {
        int principal = (int) readInput("Principal ($1K - $1M): ", 1_000, 1_000_000);
        float annualInterestRate = (float) readInput("Annual Interest Rate (0.1 - 30): ", 0.1f, 30f);
        byte years = (byte) readInput("Period (Years, 1 - 30): ", 1, 30);

        MortgageCalculator calculator = new MortgageCalculator(principal, annualInterestRate, years);
        System.out.println("Mortgage: " + calculator.getFormattedMortgage());
    }

    private static double readInput(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;

        while (true) {
            System.out.print(prompt);
            try {
                value = scanner.nextDouble();
                if (value >= min && value <= max)
                    break;
                System.out.println("Enter a value between " + min + " and " + max);
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }
        }
        return value;
    }
}
