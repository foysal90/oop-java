package HomeWork;

import java.util.Scanner;

public class classWork2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter ur first name: ");
        String  FirstName = input.nextLine();
        System.out.println(" enter ur second name: ");
        String  secondName = input.nextLine();

        String fn = FirstName.concat(" "+ secondName);
        System.out.println(fn);

        if (fn.contains("a") || fn.contains("e")  || fn.contains("u")){

            System.out.println("vowel");

        }

        else{
            System.out.println("consonent");
        }
    }
}
