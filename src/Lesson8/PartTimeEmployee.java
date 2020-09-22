package Lesson8;

public class PartTimeEmployee extends Employee {
    private int totalWorkingShift;
    private long baseSalary;
    final long MEAL_ALLOWANCE = 0;

    public PartTimeEmployee(String name, int age, String identificationNumber, int totalWorkingShift, long baseSalary) {
        super(name, age, identificationNumber);
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }

    public int getTotalWorkingShift() {
        return totalWorkingShift;
    }

    public void setTotalWorkingShift(int totalWorkingShift) {
        this.totalWorkingShift = totalWorkingShift;
    }

    public long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
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
        long salaryRate = getBaseSalary();
        return salaryRate;
    }

    @Override
    public int getWorkingCount() {
        int count = getTotalWorkingShift();
        return count;
    }

    @Override
    public double calculateSalary() {
        double calculateSalary = getWorkingCount()*getSalaryRate()+getMealAllowance();
        return calculateSalary;
    }

    @Override
    public String toString() {
        return super.toString() + "     PartTimeEmployee{" +
                "totalWorkingShift=" + totalWorkingShift +
                ", baseSalary=" + baseSalary +
                ", MEAL_ALLOWANCE=" + MEAL_ALLOWANCE +
                ", Total Salary=" + calculateSalary() +
                '}';
    }
}
