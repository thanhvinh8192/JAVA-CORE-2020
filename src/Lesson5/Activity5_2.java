
package Lesson5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Activity5_2 {
    public static void main(String[] args) {
        Scanner arrLen = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = arrLen.nextInt();
        int myArray[] = new int[n];
        int len = myArray.length;
        int result[] = new int[len];
        int j = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter value of index " + i + " : ");
            myArray[i] = scanner.nextInt();
        }
        Arrays.sort(myArray);
        for (int i = 0; i < len - 1; i++) {
            if (myArray[i] != myArray[i + 1]) {
                result[j++] = myArray[i];
            }
        }
        result[j++] = myArray[len - 1];
        for (int a = 0; a < j; a++) {
            System.out.println(result[a]);
        }
    }
}