package Lesson2;

import java.util.Scanner;

public class Activity_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your value: ");
        int a = scanner.nextInt();
        for(int i=1; i<=10; i++)
            System.out.println("Your result is: "+a+"*"+i+"="+a*i);
    }
}