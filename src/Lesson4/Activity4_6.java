package Lesson4;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Activity4_6 {
    public static void main(String[] args) {
        System.out.print("Input the number you want convert: ");
        Scanner scanner = new Scanner(System.in);
        int  decimal = scanner.nextInt();
        int[] binary = new int[50];
        int index = 0;
        while (decimal >0 ){
            binary[index++] = decimal%2;
            decimal = decimal/2;
        }
        System.out.print("The number after convert to binary: ");
        for (int i = index-1; i >= 0; i--){
            System.out.print(binary[i]);
        }
    }
}
