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
        System.out.print("Cua hang ban nhieu dt nhat: " + storeManagement.BestQuantityStore());
        System.out.print("Cua hang ban it dt nhat: " + storeManagement.LowestQuantityStore());
        System.out.print("Cua hang co doanh thu cao nhat: " + storeManagement.BestSoldStore());
        System.out.print("Cua hang co doanh thu thap nhat: " + storeManagement.LowestSoldStore());
        System.out.print("So luong dien thoai co 5G: " + storeManagement.AllPhoneHave5G());




    }
}
