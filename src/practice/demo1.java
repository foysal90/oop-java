package practice;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            String fname,lname,email;
            int pass;
            System.out.println("FirstName : " );
            fname = s.nextLine();
            System.out.println("LastName : " );
            lname = s.nextLine();
            System.out.println("Email : " );
            email = s.nextLine();
            System.out.println("PASSWORD : " );
            pass =s.nextInt();

            System.out.println("FirstName, : " + fname + " LastName, : " + lname + " Email ,: "+ email + " Pass : "+ pass);




        }catch (Exception r){
            System.out.println("error " + r);

        }
        finally {
            System.out.println("Password only contains numbers , no letters or special charactors accepted");
        }
    }
}
