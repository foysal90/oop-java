package HomeWork;

import java.util.Scanner;

public class palingdrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String originalStr = input.nextLine();

        // Convert the string to lowercase and remove non-alphabetic characters
        originalStr = originalStr.toLowerCase().replaceAll("[^a-z]", "");

        // Create a new string in reverse order
        String reversedStr = "";

//        for (int i = originalStr.length() - 1; i >= 0; i--) {
//            reversedStr += originalStr.charAt(i);
//        }

        // Compare the original string with the reversed string
        if (originalStr.equals(reversedStr)) {
            System.out.println(originalStr + " is a palindrome.");
        } else {
            System.out.println(originalStr + " is not a palindrome.");
        }
    }
}
