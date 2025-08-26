package lab;

public class FizzBuss {

    public static void main(String args[]) {
        calcFizzBuzz();
    }

    private static void calcFizzBuzz() {
        int end = 100;
        for (int i = 1; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
                continue;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz ");
                continue;
            };
            if (i % 3 == 0) {
                System.out.print("Fizz ");
                continue;
            }
            else {
                System.out.print(" " + i + " ");
                continue;
            }
        }
    }
}
