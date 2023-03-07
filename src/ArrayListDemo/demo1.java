package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
    public static void main(String[] args) {
        ArrayList <Integer> number = new ArrayList<>();
        number.add(50);
        number.add(30);
        number.add(-2);
        number.add(5);
        number.add(-12);
        number.add(2);
        System.out.println(number);


//        sorting arraylist ascending
        Collections.sort(number);
        System.out.println(number);;

//        sorting arraylist decending

        Collections.sort(number, Collections.reverseOrder());
        System.out.println(number);;
    }
}
