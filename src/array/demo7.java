package array;

import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] A = new int[2][3];
        int [][] B = new int[2][3];

        System.out.println("enter values for A matrix : ");

        // getting input for A matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col] = input.nextInt();

            }

        }


        System.out.print("A =");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col <3; col++) {
                System.out.print(" "+ A[row][col]);


            }
            System.out.println();
        }

        System.out.println("enter values for B matrix : ");
        // getting input for B matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                B[row][col] = input.nextInt();

            }

        }


        System.out.print("B =");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col <3; col++) {
                System.out.print(" "+ B[row][col]);


            }
            System.out.println();
        }

    }
}
