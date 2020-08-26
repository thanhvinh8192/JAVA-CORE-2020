package Lesson4;


import java.util.Scanner;

public class Activity4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your index: ");
        int n = scanner.nextInt();

        int fib1 = 0, fib2 = 1;
        System.out.print("Your Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(fib1 + "  ");
            int sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
        }
    }
}