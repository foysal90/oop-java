package array;

import java.util.Scanner;

public class syeda {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

               System.out.println("Please enter 4 numbers : ");




                int[][] marks= new int[2][3];

                // Take user input for each element of the matrix
                for (int i = 0; i < marks.length; i++) {
                    for (int j = 0; j < marks.length; j++) {

                        marks[i][j] = scanner.nextInt();
                    }
                }

                // Calculate the sum of all elements
                int Sum = 0;
                for (int[] row : marks) {           // USING FOREACH LOOP
                    for (int element : row) {
                        Sum = Sum + element;
                    }
                }

                // Calculate the average of all elements

                double avg =  Sum / 4;

                System.out.println("The sum of all elements = " + Sum);
                System.out.println("The average of all elements = " +avg);


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
        if (avg <40 ) {
            System.out.println("F");

        }


            }
        }

//
//        Scanner keyboard = new Scanner(System.in);
//        int[][] marks = new int[1][3];
//        int sum = 0;
//        System.out.println("enter 5 marks : ");
//
//        for (int i = 0; i < marks.length; i++) {
//            for (int j = 0; j < marks.length; j++) {
//                marks[i][j] = keyboard.nextInt();
//            }
//
//
//        }
//
//
//
//        for (int i =0; i < marks.length; i++) {
//            for (int j = 0; j < marks[0].length; j++) {
//                sum = sum + j;
//
//            }
//
//        }
//
//
//        int average = sum / 5;
//        System.out.println(" sum of sum : " + sum);
//        System.out.println(" The average of min : " + average);
//
//        if (average > 100 && average < 90) {
//            System.out.println("E");
//
//        }
//
//        if (average > 90 && average < 80) {
//            System.out.println("O");
//        }
//
//        if (average > 80 && average < 70) {
//            System.out.println("A");
//        }
//
//        if (average > 70 && average < 60) {
//            System.out.println("B");
//        }
//        if (average > 60 && average < 50) {
//            System.out.println("C");
//        }
//        if (average > 40 && average < 50) {
//            System.out.println("D");
//
//        }
//        if (average < 50) {
//            System.out.println("F");
//        }
//
//        else {
//            System.out.println("nothing");
//        }
//    }
//}


