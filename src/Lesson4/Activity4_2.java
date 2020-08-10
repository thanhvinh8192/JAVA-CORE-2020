package Lesson4;

import java.util.Scanner;

public class Activity4_2 {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String star1 = "*", star2="**";

        for (int j = 1; j <= n; j++){
                System.out.println(star1);
                star1 = star1 +  star2;
                //spaceCharacter = spaceCharacter - character;

        }
    }
}
