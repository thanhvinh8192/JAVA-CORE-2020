package Lesson7;

public class FullTimeEmployee extends Employee {
    private double baseSalary;
    private boolean isManager;
    private int overTimeDay;


    public FullTimeEmployee(String nameEmployee, String idEmployee, boolean isManager, int overTimeDay) {
        super(nameEmployee, idEmployee);
        this.isManager = isManager;
        this.overTimeDay = overTimeDay;
        if(isManager()){
            baseSalary = 2000000;
        }
        else {
            baseSalary = 1000000;
        }
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "baseSalary=" + baseSalary +
                ", isManager=" + isManager +
                ", overTimeDay=" + overTimeDay +
                ", Total Salary=" + TotalSalary() +
                '}';
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
       this.baseSalary = baseSalary;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public int getOverTimeDay() {
        return overTimeDay;
    }

    public void setOverTimeDay(int overTimeDay) {
        this.overTimeDay = overTimeDay;
    }

    /**
     * Phuong thuc tinh luong tong va luong OT cua nhan vien Fultime
     */

    public double OTSalary(){
        double otSalary = getOverTimeDay() * 800000;
        return otSalary;
    }

    public double TotalSalary(){
        double totalSalary = getBaseSalary() + OTSalary();
        return totalSalary;
    }
}
