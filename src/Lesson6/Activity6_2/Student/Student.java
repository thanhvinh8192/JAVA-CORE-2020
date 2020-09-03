package Lesson6.Activity6_2.Student;

public class Student {
    private  String name;
    public float gpa;

    //Create constructor
    public  Student(){ }

    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    //creat setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }



    public boolean checkPassFail(){
        if (gpa>=1.5){
            return true;
        }
        else {
            return false;
        }
    }
    public void GetInfo(){
        System.out.println("Ten SV: " + getName());
        System.out.println("GPA: " + getGpa());
    }
}
