package vowelCheck;

import java.util.Locale;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your First Name : ");
        String FirstName = input.nextLine();
        System.out.println("Please Enter Your Last Name : ");
        String LastName = input.nextLine();

        String FullName = FirstName.concat(" " + LastName).toLowerCase();
        System.out.println(FullName);

        int Count = 0;

        for (int i = 0; i < FullName.length(); i++) {
            char c = FullName.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                Count++;
            }
        }


        if (Count >= 3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
