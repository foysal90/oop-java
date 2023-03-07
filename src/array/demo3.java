package array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        String [] family = {"saira", "aisha", "foysal", "rehana"};

        Arrays.sort(family);
        for (int i = 0; i < family.length; i++) {
            System.out.println(family[i]);

        }

        int [] num = {10,50,5,2,15,20,35};
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }

//        Scanner s = new Scanner(System.in);
//        int [] num2 = new int[5];
//        Arrays.sort(num2);
//        System.out.println("Please enter 5 numbers: ");
//
//
//
//
//
//        for (int i = 0; i <num2.length ; i++) {
//            num2[i] = s.nextInt();
//            System.out.println(num2[i]);
//
//        }



    }
}
