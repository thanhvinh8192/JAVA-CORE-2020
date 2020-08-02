package Lesson2;

import java.util.Scanner;

public class Activity_11 {
    public static void main(String[] args) {
        System.out.println("This is my first program");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value of b: ");
        int b = scanner.nextInt();
        System.out.println("Result of a+b =: " + (a+b));
        System.out.println("Result of a-b =: " + (a-b));
        System.out.println("Result of a*b =: " + (a*b));
        System.out.println("Result of a/b =: " + (a/b));
        System.out.println("Result of a%+b =: " + (a%b));
    }
}