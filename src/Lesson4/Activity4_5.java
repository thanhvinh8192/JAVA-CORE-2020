package Lesson4;

import java.util.Scanner;

public class Activity4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number  = scanner.nextInt();
        int facNumber = 1;
        for (int i = 1; i<=number; i++){
            facNumber = facNumber * i;
        }
        System.out.println("The factorial of your number: " + facNumber);
    }
}
