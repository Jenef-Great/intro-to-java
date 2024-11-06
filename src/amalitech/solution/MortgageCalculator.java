package amalitech.solution;

import java.text.NumberFormat;

class MortgageCalculator {

    private static final byte MONTHS_IN_YEAR = 12;
    private static final byte PERCENT = 100;

    private int principal;
    private float annualInterestRate;
    private byte years;

    public MortgageCalculator(int principal, float annualInterestRate, byte years) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }

    public double calculateMortgage() {
        float monthlyInterestRate = getMonthlyInterestRate();
        int numberOfPayments = getNumberOfPayments();

        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }

    private float getMonthlyInterestRate() {
        return annualInterestRate / PERCENT / MONTHS_IN_YEAR;
    }

    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }

    public String getFormattedMortgage() {
        return NumberFormat.getCurrencyInstance().format(calculateMortgage());
    }
}