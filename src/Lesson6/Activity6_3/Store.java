package Lesson6.Activity6_3;

public class Store {
    private String nameStore, addressStore;
    private int totalSP;
    private SmartPhone[] phones;


    public Store(String nameStore, String addressStore, int totalSP, SmartPhone[] phones) {
        this.nameStore = nameStore;
        this.addressStore = addressStore;
        this.totalSP = totalSP;
        this.phones = phones;
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


    public int count5G(){
        int count = 0;
        for (SmartPhone sm: phones) {
            if(sm.isHas5G()==true){
                count++;
            }
        }
        return count;
    }
}
