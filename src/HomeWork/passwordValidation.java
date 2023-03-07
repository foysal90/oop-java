package HomeWork;

import java.util.Scanner;

public class passwordValidation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please Enter Your Password Below :");

        String password = s.nextLine();

        if (password.matches(".*[#$&]{1,}.*") && password.matches(".*[0-9]{1,}.*") && password.length()>=6 && password.length()<=20){
            System.out.println("You have successfully Registered");
        }
        else {
            System.out.println("Please Enter At least one special character and a number ");
        }
    }
}
