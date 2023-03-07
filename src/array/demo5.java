package array;

import java.lang.reflect.Array;

public class demo5 {
    public static void main(String[] args) {
//        using for loop

        String [] fruits = {"apples", "orange", "pineapple", "banana"};

        System.out.println(Array.getLength(fruits));

        for (String x : fruits){
            System.out.println(x);
        }
        System.out.println();

        int [] num = {10 ,15,25,35,45};
        int sum = 0;

        for (int y : num){
            sum = sum + y;
        }
        System.out.println("total value of aum = " + sum);
    }
}
