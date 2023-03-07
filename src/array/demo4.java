package array;

import java.util.Arrays;
import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int [] num2 = new int[5];
        Arrays.sort(num2);
        System.out.println("Please enter 5 numbers: ");





        for (int i = 0; i <num2.length ; i++) {
            num2[i] = s.nextInt();
            System.out.println(num2[i]);

        }


        int [] num1 = {5,2,10,3,1};
        Arrays.sort(num1);

        for (int i = 0; i <num1.length ; i++) {

            System.out.println(num1[i]);

        }

    }
}
