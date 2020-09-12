package Lesson7;

public class PartTimeEmployee extends Employee {
    private int workHouseNumber;

    public PartTimeEmployee(String nameEmployee, String idEmployee, int workHouseNumber) {
        super(nameEmployee, idEmployee);
        this.workHouseNumber = workHouseNumber;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "workHouseNumber=" + workHouseNumber +
                '}';
    }

    public int getWorkHouseNumber() {
        return workHouseNumber;
    }

    public void setWorkHouseNumber(int workHouseNumber) {
        this.workHouseNumber = workHouseNumber;
    }

    public double TotalSalary(){
        double totalSalary = getWorkHouseNumber() * 100000;
        return totalSalary;
    }
}
