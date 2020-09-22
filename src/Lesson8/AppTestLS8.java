package Lesson8;

import java.util.Scanner;

public class AppTestLS8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Quantity Employee: ");
        int n = input.nextInt();
        EmployeeManagement employeeManagement = new EmployeeManagement(n);
        System.out.println("Employees info:");
        employeeManagement.PrintInfo();
        System.out.println("Employee have highest salary:");
        employeeManagement.MaxTotalSalary();
        System.out.println("Employee have lowest salary:");
        employeeManagement.MinTotalSalary();
    }
}
