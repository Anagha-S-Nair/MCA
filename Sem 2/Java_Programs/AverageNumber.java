// PROGRAM - 21
// Find the average of N positive integers, raising a user
// defined exception for each negative input.

import java.util.*;

class NegativeNumberException extends Exception {
    NegativeNumberException(String message) {
        super(message);
    }
}

public class AverageNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;

        try {
            System.out.println("Enter no. of integers:");
            n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter numbers " + (i + 1) + ":");
                int num = sc.nextInt();

                if (num < 0) {
                    throw new NegativeNumberException("Negative number entered: " + num);
                }

                sum += num;
            }

            double avg = (double) sum / n;
            System.out.println("Average = " + avg);

        } catch (NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}