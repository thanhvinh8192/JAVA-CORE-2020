package Lesson7;

import java.util.Scanner;

public class EmployeeManagement {
    private  Employee[] employee;

    public EmployeeManagement(int quantityEmployee ) {
        employee = new Employee[quantityEmployee];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < quantityEmployee; i++) {
            System.out.println("Choose kind of employee: ");
            System.out.println("1. Full time employee");
            System.out.println("2. Part time employee");
            int option = input.nextInt();
            input.nextLine();
            switch (option){
                case 1: {
                    System.out.print("Employee's name " + (i+1) + ": ");
                    String nameEmployee = input.nextLine();
                    System.out.print("Employee's ID: ");
                    String idEmployee = input.nextLine();
                    System.out.print("This is a manager (true/false)? ");
                    boolean isManager = input.nextBoolean();
                    System.out.print("Overtime days: ");
                    int overTimeDay = input.nextInt();
                    input.nextLine();
                    employee[i] = new FullTimeEmployee(nameEmployee, idEmployee, isManager, overTimeDay);
                }
                break;
                case 2: {
                    System.out.print("Employee's name " + (i+1) + ": ");
                    String nameEmployee = input.nextLine();
                    System.out.print("Employee's ID: ");
                    String idEmployee = input.nextLine();
                    System.out.print("Work hour numbers: ");
                    int workHourNumber = input.nextInt();
                    input.nextLine();
                    employee[i] = new PartTimeEmployee(nameEmployee, idEmployee, workHourNumber);
                }
                break;
                default: {
                    System.out.println("Please choose 1 or 2");
                }
            }
        }
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

}
