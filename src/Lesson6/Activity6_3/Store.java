package Lesson6.Activity6_3;

import java.util.Scanner;

public class Store {
    private String nameStore, addressStore;
    private int totalSP;
    private SmartPhone[] phones;

    public  Store(){

    }

    public Store(String nameStore, String addressStore, int totalSP, SmartPhone[] phones) {
        this.nameStore = nameStore;
        this.addressStore = addressStore;
        this.totalSP = totalSP;
        this.phones = phones;
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<phones.length; i++){
            System.out.print("Ten nhan hieu DT thu " + (i+1) + ": ");
            String brandName = scanner.nextLine();
            System.out.print("Bluetooth: ");
            boolean hasBluetooth = scanner.nextBoolean();
            System.out.print("5G: ");
            boolean has5G = scanner.nextBoolean();
            System.out.print("Wifi: ");
            boolean hasWifi = scanner.nextBoolean();
            System.out.print("OS: ");
            String oS = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Memory: ");
            float memory = scanner.nextFloat();
            System.out.print("Price: ");
            long price = scanner.nextLong();
            System.out.print("Total Sold: ");
            int totalSold = scanner.nextInt();
            phones[i] = new SmartPhone(brandName, hasBluetooth, has5G, hasWifi, oS, color, memory, price, totalSold);
        }
    }


    public String getNameStore() {
        return nameStore;
    }

    public void setNameStore(String nameStore) {
        this.nameStore = nameStore;
    }

    public String getAddressStore() {
        return addressStore;
    }

    public void setAddressStore(String addressStore) {
        this.addressStore = addressStore;
    }

    public int getTotalSP() {
        return totalSP;
    }

    public void setTotalSP(int totalSP) {
        this.totalSP = totalSP;
    }

    public SmartPhone[] getSmartPhones() {
        return phones;
    }

    public void setSmartPhones(SmartPhone[] smartPhones) {
        this.phones = smartPhones;
    }



    /**
     * Dem tong so DT ban duoc
     */
    public int tongDTSold(){
        int tong = 0;
        for (SmartPhone sm: phones) {
            tong = tong + sm.getTotalSold();
        }
        return tong;
    }

    /**
     * Tinh tong doanh thu
     */
    public long Tongdoanhthu(){
        long tongDoanhThu = 0;
        for (SmartPhone dt: phones) {
            long doanhthu = dt.getTotalSold()*dt.getPrice();
            tongDoanhThu = tongDoanhThu + doanhthu;
        }
        return tongDoanhThu;
    }

    public int count5G(){
        int count = 0;
        for (SmartPhone sm: phones) {
            if(sm.isHas5G() == true){
                count++;
            }
        }
        return count;
    }

    public int countWifi(){
        int count = 0;
        for (SmartPhone sm: phones) {
            if(sm.isHasWifi()== true){
                count++;
            }
        }
        return count;
    }

    public int countBluetooth(){
        int count = 0;
        for (SmartPhone sm: phones) {
            if(sm.isHasBluetooth()){
                count++;
            }
        }
        return count;
    }
}
