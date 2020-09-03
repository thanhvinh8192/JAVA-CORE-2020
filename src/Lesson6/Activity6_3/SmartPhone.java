package Lesson6.Activity6_3;

public class SmartPhone {
    private String brandName;
    private boolean hasBluetooth, has5G, hasWifi;
    private String oS, color;
    private float memory;
    private long price;
    private int totalSold;

    //Create Constructor
    public SmartPhone(String brandName, boolean hasBluetooth, boolean has5G, boolean hasWifi, String oS, String color, float memory, long price, int totalSold) {
        this.brandName = brandName;
        this.hasBluetooth = hasBluetooth;
        this.has5G = has5G;
        this.hasWifi = hasWifi;
        this.oS = oS;
        this.color = color;
        this.memory = memory;
        this.price = price;
        this.totalSold = totalSold;
    }

    //Setter and Getter
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public boolean isHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public String getoS() {
        return oS;
    }

    public void setoS(String oS) {
        this.oS = oS;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(int totalSold) {
        this.totalSold = totalSold;
    }

    public String toString(){
        return "Brand: " + brandName + "\n" +
                "Bluetooth:  " + hasBluetooth + "\n" +
                "5G: " + has5G + "\n" +
                "Wifi: " + hasWifi + "\n" +
                "OS: " + oS + "\n" +
                "Memory: " + memory + "\n" +
                "Color: " + color + "\n" +
                "Price: " + price + "\n" +
                "TotalSold: " + totalSold;
    }


}
