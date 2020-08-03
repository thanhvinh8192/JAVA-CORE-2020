package Lesson2;

import java.util.Scanner;

public class Activity_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scanner.nextInt();
        int sum = n+ (n*11) + (n*111);
        System.out.println(n+"+"+n*11+"+"+n*111+"="+sum);
    }
}
