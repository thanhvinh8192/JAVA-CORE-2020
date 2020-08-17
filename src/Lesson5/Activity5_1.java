package Lesson5;

import java.util.Scanner;

public class Activity5_1 {
    public static void main(String args[])
    {
        int num, i, rem, temp, counter=0;
        for(i=1; i<=500; i++)
        {
            temp = i;
            num = 0;
            while(temp > 0)
            {
                rem = temp%10;
                num = num + rem*rem*rem;
                temp = temp/10;
            }
            if(i == num)
            {
                if(counter == 0)
                {
                    System.out.print("Armstrong number: ");
                }
                System.out.print(i + "  ");
                counter++;
            }
        }
    }
}
