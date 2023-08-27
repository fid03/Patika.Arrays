package PracticeTasks;

import java.util.Scanner;

public class HarmonicMean {
    public static void main(String[] args) {
        double result=calculateHarmonicMean();
        System.out.print("Harmonic average value:"+result);
    }
    public static double calculateHarmonicMean(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array:");
        int n=sc.nextInt();
        System.out.println();
        int []arr=new int[n];
        System.out.println("Enter values of array..");
        for(int i=0;i<arr.length;i++){
            System.out.print((i+1)+".Element=");
            arr[i]=sc.nextInt();
        }
        double harmonicSeries=0.0;
        for(int i=0;i< arr.length;i++){
            harmonicSeries+=1.0/arr[i];
        }
        System.out.println(harmonicSeries);
        double average=arr.length/harmonicSeries;
        return average;
    }
}
