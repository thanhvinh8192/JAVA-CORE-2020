package Lesson6.Activity6_3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so cua hang can quan ly: ");
        n = scanner.nextInt();
        Store[] stores = new Store[n];
        StoreManagement storeManagement = new StoreManagement(stores.length, stores);

    }
}
