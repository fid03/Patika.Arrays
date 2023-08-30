package PracticeTasks;

import java.util.Scanner;

public class ArrayOrder {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("Enter array elements:");
        for(int i=0;i<arr.length;i++){
            System.out.print((i+1)+".Element:");
            arr[i]= sc.nextInt();
        }
        sortArray(arr);
    }
    public static void sortArray(int[]arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Ascending order of elements in array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
