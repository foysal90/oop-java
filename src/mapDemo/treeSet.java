package mapDemo;

import java.util.Arrays;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        //treeSet method  by default sorted
        TreeSet<Integer> number = new TreeSet<>();
        number.add(50);
        number.add(40);
        number.add(20);
        number.add(10);
        number.add(30);
        for (int i : number){
            System.out.println("value of i :" + i);
        }

        System.out.println("number : " + number);
// declaring array with sorting
        int [] num = {50,20,40,10,30};

        Arrays.sort(num);
        for (int i = 0; i <num.length ; i++) {
            System.out.println(num[i]);

        }


    }
}
