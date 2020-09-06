package Lesson7;

public class FullTimeEmployee extends Employee {
    private double baseSalary;
    private boolean isManager;
    private int overTimeDay;

    @Override
    public String toString(){
        return
    }
    public FullTimeEmployee(String nameEmployee, String idEmployee, boolean isManager, int overTimeDay) {
        super(nameEmployee, idEmployee);
        this.isManager = isManager;
        this.overTimeDay = overTimeDay;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
        if (this.isManager()){
            baseSalary = 20000000d;
        }
        else {
            baseSalary = 10000000d;
        }
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
}
