package Lesson6.Activity6_3;

import java.util.Scanner;

public class StoreManagement {
    private int totalStore;
    private Store[] stores;

    public StoreManagement(){

    }

    public StoreManagement(int totalStore) {
        stores = new Store[totalStore];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<totalStore; i++){
            System.out.println("Nhap thong tin cua hang thu " + (i+1) + ": ");
            System.out.print("Ten cua hang: ");
            String nameStore = scanner.nextLine();
        }
    }
}
