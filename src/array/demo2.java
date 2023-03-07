package array;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int [] marks = new int[5];
        int sum = 0;

        System.out.print("Please enter 5 numbers: " );
        

        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
            
        }

        for (int i = 0; i <  marks.length ; i++) {
            sum = sum + marks[i];

        }
        int avg = sum / 5;
        System.out.println("sum of sum: " + sum);
        System.out.println("average of sum = " + avg);

        if (avg >=90 && avg<= 100) {
            System.out.println("E");

        }
        if (avg >=80 && avg<= 90) {
            System.out.println("o");

        }
        if (avg >=70 && avg<= 80) {
            System.out.println("A");

        }
        if (avg >=60 && avg< 70) {
            System.out.println("B");

        }
        if (avg >=50 && avg<= 60) {
            System.out.println("C");

        }
        if (avg >=40 && avg<=50) {
            System.out.println("D");

        }



    }
}
