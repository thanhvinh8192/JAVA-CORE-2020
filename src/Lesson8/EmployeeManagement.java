package Lesson8;

import java.util.Scanner;

public class EmployeeManagement {
    private int n;
    private Employee[] employees;

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public EmployeeManagement(int n) {
        this.n = n;
        employees =  new Employee[n];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            System.out.println("Choose kind of employee: ");
            System.out.println("1. Full time employee");
            System.out.println("2. Part time employee");
            int option = input.nextInt();
            input.nextLine();
            switch (option){
                case 1: {
                    System.out.print("Employee's name " + (i+1) + ": ");
                    String nameEmployee = input.nextLine();
                    System.out.print("Employee's age " + (i+1) + ": ");
                    int ageEmployee = input.nextInt();
                    System.out.print("Identification Number " + (i+1) + ": ");
                    String identificationNumber = input.nextLine();
                    input.nextLine();
                    System.out.print("Working days " + (i+1) + ": ");
                    int totalWorkingDays = input.nextInt();
                    System.out.print("Daily Salary " + (i+1) + ": ");
                    long dailySalary = input.nextLong();
                    input.nextLine();
                    employees[i] = new FullTimeEmployee(nameEmployee, ageEmployee, identificationNumber, totalWorkingDays, dailySalary);
                }
                break;
                case 2: {
                    System.out.print("Employee's name " + (i+1) + ": ");
                    String nameEmployee = input.nextLine();
                    System.out.print("Employee's age " + (i+1) + ": ");
                    int ageEmployee = input.nextInt();
                    System.out.print("Identification Number " + (i+1) + ": ");
                    String identificationNumber = input.nextLine();
                    input.nextLine();
                    System.out.print("Total Working Shift " + (i+1) + ": ");
                    int totalWorkingShift = input.nextInt();
                    System.out.print("Base Salary " + (i+1) + ": ");
                    long baseSalary = input.nextLong();
                    input.nextLine();
                    employees[i] = new PartTimeEmployee(nameEmployee, ageEmployee, identificationNumber, totalWorkingShift, baseSalary);
                }
                break;
                default: {
                    System.out.println("Choose option 1 or 2");
                }
            }
        }
    }

    public void MaxTotalSalary(){
        double max = 0;
        Employee tempEmployee = null;
        for (Employee x : employees) {
            if (max <= x.calculateSalary()){
                max = x.calculateSalary();
                tempEmployee = x;
            }
        }
        System.out.println(tempEmployee.toString());
    }

    public  void MinTotalSalary(){
        double min = employees[0].calculateSalary();
        Employee tempEmployee = null;
        for (Employee x : employees) {
            if (min >= x.calculateSalary()){
                min = x.calculateSalary();
                tempEmployee = x;
            }
        }
        System.out.println(tempEmployee.toString());
    }

    public void PrintInfo(){
        for (Employee x : employees) {
            if (x instanceof FullTimeEmployee){
                FullTimeEmployee fullTime = (FullTimeEmployee) x;
                System.out.println(fullTime.toString());
            }
            if (x instanceof PartTimeEmployee){
                PartTimeEmployee partTime = (PartTimeEmployee) x;
                System.out.println(partTime.toString());
            }

        }
    }
}
