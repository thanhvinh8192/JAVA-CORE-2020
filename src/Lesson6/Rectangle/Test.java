package Lesson6.Rectangle;

import Lesson6.Rectangle.Rectangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("Nhap chieu dai: ");
        Scanner widthS = new Scanner(System.in);
        int width = widthS.nextInt();
        //System.out.println();
        System.out.print("Nhap chieu rong: ");
        Scanner heightS = new Scanner(System.in);
        int height = heightS.nextInt();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.print("Chu vi la: " + rectangle.chuviRec());
        System.out.println();
        System.out.print("Dien tich la: " + rectangle.dientichRec());
        System.out.println();
        rectangle.printInfo();
        boolean kiemtrahinhvuong = rectangle.checkHinhvuong();
        if(kiemtrahinhvuong==true){
            System.out.print("Hinh nay la hinh vuong");
        }
        else {
            System.out.print("Hinh nay khong phai hinh vuong");

        }
    }
}
