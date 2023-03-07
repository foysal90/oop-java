package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class demo {
    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(3,40);
        System.out.println(num.size());
        System.out.println(num);
        boolean check = num.isEmpty();
        System.out.println(check);

        boolean check2 = num.contains(30);
        System.out.println(check2);

        int z = num.get(0);
        System.out.println("index 0 = " +z);




        ArrayList <Integer> sum = new ArrayList<>();

        sum.add(50);
        sum.add(60);
        sum.add(70);
        sum.set(1, 80);         // set method replace the value
        for ( int x : sum){
            System.out.println(x);

        }

        ArrayList <Integer> num1 = new ArrayList<>();
        num1.add(100);
        num1.add(200);
        num1.add(300);

        Iterator itr = num1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        for (int y : num1){
            System.out.println(y);
        }

        num1.clear();
        System.out.println(num1);
        boolean check3 = num1.isEmpty();
        System.out.println(check3);





    }
}
