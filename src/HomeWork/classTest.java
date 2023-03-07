package HomeWork;

import java.util.Scanner;

public class classTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the values : ");
        int count = 0;
        String s = input.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' '){
                count++;
            }


        }
        System.out.println(count);



        System.out.println("you have entered " + s.replace(" ","") .length( ) + " characters ") ;




    }
}
