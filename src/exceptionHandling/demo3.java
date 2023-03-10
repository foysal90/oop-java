package exceptionHandling;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        // unknown exceptions handling

        try {
            int [] s = new int[4];
            s[4]= 10;


            System.out.println(s);

        }catch (ArithmeticException e1){
            System.out.println(e1);

        }catch (StringIndexOutOfBoundsException a) {
            System.out.println(a);
        }catch (Exception e2){
            System.out.println(e2);
        }
        finally {
            System.out.println("i will be printed anyway");
        }
    }
}
