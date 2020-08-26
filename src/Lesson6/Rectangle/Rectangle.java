package Lesson6.Rectangle;

public class Rectangle {
    private double widthRec;
    private double heightRec;

    public Rectangle(double widthRec, double heightRec) {
        this.widthRec = widthRec;
        this.heightRec = heightRec;
    }

    public double getWidthRec() {
        return widthRec;
    }

    public void setWidthRec(double widthRec) {
        this.widthRec = widthRec;
    }

    public double getHeightRec() {
        return heightRec;
    }

    public void setHeightRec(double heightRec) {
        this.heightRec = heightRec;
    }

    public double chuviRec(){
        double preRec = (widthRec+heightRec)*2;
        return preRec;
    }

    public double dientichRec(){
        double acreageRec = widthRec*heightRec;
        return acreageRec;
    }

    public void printInfo(){
        System.out.println("Chieu dai: "+widthRec);
        System.out.println("Chieu rong: "+heightRec);
    }

    public boolean checkHinhvuong(){
        if (widthRec==heightRec){
            return true;

        }
        else {
            return false;
        }
    }
}

