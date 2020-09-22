package Lesson8;

public abstract class Employee {
    private String name;
    private int age;
    private String identificationNumber;

    public Employee(String name, int age, String identificationNumber) {
        this.name = name;
        this.age = age;
        this.identificationNumber = identificationNumber;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", identificationNumber=" + identificationNumber +
                '}';
    }

    public abstract long getMealAllowance ();

    public abstract double getSalaryRate();

    public abstract   int getWorkingCount();

    public abstract double calculateSalary();
}
