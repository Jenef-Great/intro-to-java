package lab;

/**
 * principal
 * rate
 * time
 * mortgage value
 */

public class Mortgage {
    public static void main(String args[]) {
        calcMortgage(100000, 4.2, (byte)30);
    }

    private static void calcMortgage(int principal, double rate, byte time) {
        double monthlyRate = rate / 100 / 12;
        int totalPayments = time * 12;
        double amount = principal * (monthlyRate * Math.pow(1 + monthlyRate, totalPayments)) / (Math.pow(1 + monthlyRate, totalPayments) - 1);

        System.out.println(amount);
    }
}
