package HomeWork;

import java.util.Scanner;

public class numberValidation {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Please Enter Your Phone Number Below : ");
        String number = n.nextLine();
        if (number.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}")){
            System.out.println("The Number You entered is Valid !!");
        }
        else {
            System.out.println("Please enter a valid phone Number with - format....");
        }



























//        int a;
//
//
//
//        for ( a = 0; a <3 ; a++) {
//            System.out.println("Enter your  phone number :");
//            number = n.next();
//            String s = "-{10}";
//
//            if (number.matches(s)){
//                System.out.println("The number is valid");
//            }
//            else {
//                System.out.println("Please enter a valid phone Number ");
//            }

        }
    }



