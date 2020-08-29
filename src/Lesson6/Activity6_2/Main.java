package Lesson6.Activity6_2;

import Lesson6.Activity6_2.Student.Student;
import Lesson6.Activity6_2.StudentManagement.StudentManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so SV: ");
        int n = scanner.nextInt();
        StudentManagement studentManagement = new StudentManagement(n);
        System.out.println("Tong so SV Do: " + studentManagement.countDo());
        System.out.println("Tong so SV Truot: " + studentManagement.countRot());
        System.out.println("Diem GPA cao nhat: " + studentManagement.timMax());

    }
}
