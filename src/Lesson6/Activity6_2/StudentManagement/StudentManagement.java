package Lesson6.Activity6_2.StudentManagement;

import Lesson6.Activity6_2.Student.Student;

import java.util.Scanner;

public class StudentManagement {
    private int totalStudent;
    private Student[] students;

    public StudentManagement(int totalStudent) {
        students = new Student[totalStudent];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<totalStudent; i++){
            System.out.print("Nhap thong tin SV thu " + (i+1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Nhap GPA SV thu: " + (i+1) + ": ");
            float gpa = scanner.nextFloat();
            scanner.nextLine();
            students[i] = new Student(name, gpa);
        }
    }

    public int countDo(){
        int count=0;
        for (Student i :students) {
            if (i.checkPassFail()==true){
                count= count+1;
            }
        }
        return count;
    }

    public int countRot(){
        int count=0;
        for (Student i :students) {
            if (i.checkPassFail()==false){
                count= count+1;
            }
        }
        return count;
    }

    public float timMax(){
        float maxGpa = 0;
        for (Student i : students){
            if (i.gpa>=maxGpa){
                maxGpa=i.gpa;
            }
        }
        return maxGpa;
    }

    /*public Student minGpa(){
        for (int i=0; i<students.length; i++){
            if ()
        }
    }*/

}
