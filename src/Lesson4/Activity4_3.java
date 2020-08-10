package Lesson4;

public class Activity4_3 {
    public static void main(String[] args) {
        System.out.print("So chia het cho 3: ");
        for(int i =1; i<=100; i++){
            if(i%3==0){
                System.out.print("  "+i);
            }
        }
        System.out.println();
        System.out.print("So chia het cho 5: ");
        for(int i =1; i<=100; i++){
            if(i%5==0){
                System.out.print("  "+i);
            }
        }
        System.out.println();
        System.out.print("So chia het cho 3  & 5: ");
        for(int i =1; i<=100; i++){
            if(i%3==0 && i%5==0){
                System.out.print("  "+i);
            }
        }
        }
    }
