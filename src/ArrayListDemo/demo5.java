package ArrayListDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter names : " );


        for (int i = 0; i <=3; i++) {
            names.add(s.nextLine());
        }



        if (names.contains("joe") ){
            System.out.println("Validate");}
            else{
                System.out.println("Invalid");
            }

        }
    }



