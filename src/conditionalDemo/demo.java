package conditionalDemo;


import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
           System.out.println("Please enter you age : ");

            Scanner A = new Scanner(System.in);
            int voterAge;
            voterAge = A.nextInt();

            System.out.println();
            int voterYear;

            System.out.println("Please enter your birth year : ");



            System.out.println();
            voterYear = A.nextInt();

            if(voterAge>=18 && voterYear<=2004){
                System.out.println("You can vote");
            }

            else{
                System.out.print("You cannot vote");
            }
    }



}
