package Lesson6.Activity6_3;

import java.util.Scanner;

public class StoreManagement {
    private int totalStore;
    private Store[] stores;

    public StoreManagement(){

    }

    public StoreManagement(int totalStore, Store[] stores) {
        this.totalStore = totalStore;
        this.stores = stores;
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<stores.length; i++){
            System.out.print("Nhap ten cua hang thu " + (i+1) + ": ");
            String nameStore = scanner.nextLine();
            System.out.print("Nhap dia chi cua hang " + nameStore + ": ");
            String aDDStore = scanner.nextLine();
            System.out.print("Nhap so luong DT cua cua hang " + nameStore + ": ");
            int totalSP = scanner.nextInt();
            System.out.print("Danh muc cac loai DT co trong cua hang " + nameStore + ":");
            int typeSmartphone = scanner.nextInt();
            SmartPhone[] phones = new SmartPhone[typeSmartphone];
            stores[i] = new Store(nameStore, aDDStore, totalSP, phones);
        }
    }

}
