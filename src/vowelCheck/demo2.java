package vowelCheck;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter ur first name: ");
        String  FirstName = input.nextLine();
        System.out.println(" enter ur second name: ");
        String  secondName = input.nextLine();

        String fn = FirstName.concat(" "+ secondName).toLowerCase();
        System.out.println(fn);

        if (fn.contains("a") || fn.contains("e")  || fn.contains("i") || fn.contains("o") ||fn.contains("u")){

            System.out.println("True");

        }

        else{
            System.out.println("False");
        }

        if (fn.contains("a") && fn.contains("e")  && fn.contains("i") && fn.contains("o") && fn.contains("u")){

            System.out.println("True");

        }

        else{
            System.out.println("False");
        }


    }
}
