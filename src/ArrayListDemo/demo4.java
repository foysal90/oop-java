package ArrayListDemo;

import java.util.ArrayList;


public class demo4 {
    public static void main(String[] args) {
        ArrayList <Integer> number = new ArrayList<>();


        for (int i = 0; i <=10 ; i++) {
            System.out.println("Number : " + i);

            }
        System.out.println();

        ArrayList <Integer> even = new ArrayList<>();
        for (int i = 0; i <=10 ; i++) {
            if (i%2==0){
                System.out.println("Even numbers in number: " + i);
            }



        }
        System.out.println();
        ArrayList <Integer> odd = new ArrayList<>();
        for (int i= 0; i <=10 ; i++) {
            if (i%2!=0){
                System.out.println("odd numbers in number: " + i);
            }

        }



    }
}

