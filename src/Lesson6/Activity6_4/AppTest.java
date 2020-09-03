package Lesson6.Activity6_4;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so luong dau sach co trong cua hang: ");
        int n = scanner.nextInt();
        BookManagenement bookManagenement = new BookManagenement(n);
        System.out.println("Books information:");
        bookManagenement.PrintInfo();
        System.out.println();
        System.out.println("Total Best Seller: " + bookManagenement.countBestSeller());
        System.out.println();
        System.out.println("Best Sold Book: " );
        System.out.println(bookManagenement.BestSoldBook());
    }
}
