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
        System.out.println("Store Information: ");
        storeManagement.getInfo();
        System.out.println("Cua hang ban nhieu dt nhat: " + storeManagement.BestQuantityStore());
        System.out.println("Cua hang ban it dt nhat: " + storeManagement.LowestQuantityStore());
        System.out.println("Cua hang co doanh thu cao nhat: " + storeManagement.BestSoldStore());
        System.out.println("Cua hang co doanh thu thap nhat: " + storeManagement.LowestSoldStore());
        System.out.println("So luong dien thoai co 5G: " + storeManagement.AllPhoneHave5G());
    }
}
