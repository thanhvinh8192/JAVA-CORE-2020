package Lesson4;

import java.util.Scanner;

public class Activity4_6 {
    public static void main(String[] args) {
        System.out.print("Input the number you want convert: ");
        Scanner scanner = new Scanner(System.in);
        int numberConvert = scanner.nextInt();
        for (int i = numberConvert; i>=1; i = i%2){
            if (i==1){
                break;
            }
        }
    }
}
