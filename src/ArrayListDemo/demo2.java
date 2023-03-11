package ArrayListDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class demo2 {
    public static void main(String[] args) {
        // list allows duplicate values
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Mango");
        System.out.println(fruits);
        // set does not allow duplicate values
        HashSet<String> names = new HashSet<>();
        names.add("Bangladesh");
        names.add("America");
        names.add("Canada");
        names.add("Bangladesh");
        names.add("America");
        names.add("Canada");
        names.add("England");
        names.add("Finland");

        System.out.println(names);

        //tree set

        TreeSet<String> name = new TreeSet<>();
        name.add("Bangladesh");
        name.add("America");
        name.add("Canada");

        name.add("England");
        name.add("Finland");

        System.out.println(name);
    }




}
