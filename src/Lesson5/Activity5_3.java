package Lesson5;

public class Activity5_3 {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5 ,6};
        int[] arrayB = {1,6};
        int[] arrayMerge = new int[arrayA.length + arrayB.length];
        int  count = 0;
        for(int i = 0; i<arrayA.length; i++){
            arrayMerge[i]=arrayA[i];
            count++;
        }
        for (int j=0; j<arrayB.length; j++){
            arrayMerge[count++] = arrayB[j];
        }
        System.out.print("Array after merge: ");
        for (int i = 0; i<arrayMerge.length; i++) {
            System.out.print(arrayMerge[i] + " ");
        }
    }
}
