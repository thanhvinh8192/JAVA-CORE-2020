package Lesson8;

public class FullTimeEmployee extends Employee {
    private int totalWorkingDays;
    private long dailySalary;
    private final long MEAL_ALLOWANCE = 2000000;

    public FullTimeEmployee(String name, int age, String identificationNumber, int totalWorkingDays, long dailySalary) {
        super(name, age, identificationNumber);
        this.totalWorkingDays = totalWorkingDays;
        this.dailySalary = dailySalary;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public long getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(long dailySalary) {
        this.dailySalary = dailySalary;
    }

    public long getMEAL_ALLOWANCE() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getMealAllowance() {
        long mealAllowance = getMEAL_ALLOWANCE();
        return mealAllowance;
    }

    @Override
    public double getSalaryRate() {
        double salaryRate = getDailySalary();
        return salaryRate;
    }

    @Override
    public int getWorkingCount() {
        int workingCount = getTotalWorkingDays();
        return workingCount;
    }

    @Override
    public double calculateSalary() {
        double Salary = getSalaryRate()*getWorkingCount()+getMealAllowance();
        return Salary;
    }

    @Override
    public String toString() {
        return super.toString() + "     FullTimeEmployee{" +
                "totalWorkingDays=" + totalWorkingDays +
                ", dailySalary=" + dailySalary +
                ", MEAL_ALLOWANCE=" + MEAL_ALLOWANCE +
                ", Total Salary=" + calculateSalary() +
                '}';
    }
}
