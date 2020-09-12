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
            System.out.print("Cac nhan hieu DT co trong cua hang (int) " + nameStore + ": ");
            int typeSmartphone = scanner.nextInt();
            scanner.nextLine();
            SmartPhone[] phones = new SmartPhone[typeSmartphone];
            stores[i] = new Store(nameStore, aDDStore, totalSP, phones);
        }
    }

    /**
     * Cua hang ban duoc nhieu/it DT nhat
     */
    public String BestQuantityStore(){
        int bestQuantity = 0;
        Store store = new Store();
        for (Store st : stores) {
            if (bestQuantity<=st.tongDTSold()){
                bestQuantity = st.tongDTSold();
                store = st;
            }
        }
        return "Store: " + store.getNameStore() + "     Address: " + store.getAddressStore();
    }

    public String LowestQuantityStore(){
        int lowestQuantity = stores[0].tongDTSold();
        Store store = new Store();
        for (Store st : stores) {
            if (lowestQuantity>=st.tongDTSold()){
                lowestQuantity = st.tongDTSold();
                store = st;
            }
        }
        return "Store: " + store.getNameStore() + "     Address: " + store.getAddressStore();
    }
    /**
     * Cua hang co doanh thu cao/thap nhat
     */
    public String BestSoldStore(){
        long bestSold = 0;
        Store store = new Store();
        for (Store st : stores) {
            if (bestSold<=st.TongDoanhThu()){
                bestSold = st.TongDoanhThu();
                store = st;
            }
        }
        return "Store: " + store.getNameStore() + "     Address: " + store.getAddressStore();
    }

    public String LowestSoldStore(){
        long lowestSold = stores[0].TongDoanhThu();
        Store store = new Store();
        for (Store st : stores) {
            if (lowestSold>=st.TongDoanhThu()){
                lowestSold = st.TongDoanhThu();
                store = st;
            }
        }
        return "Store: " + store.getNameStore() + "     Address: " + store.getAddressStore();
    }

    public int AllPhoneHave5G(){
        int totalPhone5G =0;
        for (Store store: stores) {
            totalPhone5G = totalPhone5G + store.count5G();
        }
        return totalPhone5G;
    }

    public void getInfo(){
        for (Store i : stores) {
            System.out.println(i.toString());
            SmartPhone[] arrSmartphone = i.phones;
            String phoneinfo = "";
            for (SmartPhone j: arrSmartphone) {
                phoneinfo = phoneinfo +  j.getBrandName() + ", ";
            }
            System.out.println("Danh sách các hãng điện thoại có trong cửa hàng: " + phoneinfo);
        }
    }
}
