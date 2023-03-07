package mapDemo;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap <Integer, String> customer = new HashMap<Integer,String>();

        customer.put(101, "foysal");
        customer.put(102, "amin");
        customer.put(103, "masum");
        // printing keys using loop
        for (int a : customer.keySet()){
            System.out.println("keys of the customer is : "+a);
        }
        // printing values using loop
        for (String i : customer.values()){
            System.out.println("values of the customer is :" +i);
        }


        // printing keys and values using loop

        for (int v : customer.keySet()){
            System.out.println("key : " + v + " , values  :" + customer.get(v));
        }



        System.out.println(customer.get( 101));
    }
}
