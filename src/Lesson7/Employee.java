package Lesson7;

public class Employee {
    private String nameEmployee;
    private String idEmployee;

    public Employee(String nameEmployee, String idEmployee) {
        this.nameEmployee = nameEmployee;
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }
}
