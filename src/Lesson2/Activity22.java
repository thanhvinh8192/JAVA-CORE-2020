package Lesson2;

import java.util.Scanner;

public class Activity22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scanner.nextInt();
        if (n<10){
            int sum = n+ (n*11) + (n*111);
            System.out.println(n+"+"+n*11+"+"+n*111+"="+sum);
        }
        else
            if(n>10&&n<100){
                int sum1 = n+ (n*101) + (n*10101);
                System.out.println(n+"+"+n*101+"+"+n*10101+"="+sum1);
        }
            else
                System.out.println("Your index must be 0<1<100");
    }
}