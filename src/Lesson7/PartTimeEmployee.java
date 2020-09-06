package Lesson7;

public class PartTimeEmployee extends Employee {
    private int workHouseNumber;

    public PartTimeEmployee(String nameEmployee, String idEmployee, int workHouseNumber) {
        super(nameEmployee, idEmployee);
        this.workHouseNumber = workHouseNumber;
    }
}
