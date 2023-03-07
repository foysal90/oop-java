package oop;

import java.util.Scanner;

public class info {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Registration r = new Registration();
        System.out.println("please enter your name :");
        r.setName(input.nextLine());
        System.out.println("please enter your email :");
        r.setEmail(input.nextLine());
        System.out.println("please enter your phoneNumber :");
        r.setPhone(input.nextLine());
        System.out.println("please enter your age :");
        r.setAge(input.nextInt());








        System.out.println("welcome," + r.getName());
        System.out.println("your email  :" + r.getEmail());
        System.out.println("your PHONE  :" + r.getPhone());
        System.out.println("Your Age :" + r.getAge());







    }
}
