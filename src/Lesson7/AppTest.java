package Lesson7;

import java.util.Scanner;

public class AppTest {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Quantity Empoloyees:");
        int quantityEmployee = input.nextInt();
        EmployeeManagement employeeManagement = new EmployeeManagement(quantityEmployee);
    }

}
