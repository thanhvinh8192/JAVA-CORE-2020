package Lesson4;

import java.util.Scanner;

public class Activity4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double number  = scanner.nextInt();
        int sumNumber = 0;
        for (int i = 1; i<=number; i++){
            sumNumber = sumNumber + i;
        }
        System.out.println("The sum of your number: " + sumNumber);
        double avgSum = sumNumber/number;
        System.out.println("The average of your number: " + avgSum);
    }
}