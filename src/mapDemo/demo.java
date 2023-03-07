package mapDemo;

import java.util.HashMap;

public class demo {
    public static void main(String[] args) {
        HashMap <String, Integer> studentInfo = new HashMap<String, Integer>();
        studentInfo.put("Amin", 34);
        studentInfo.put("Masum", 33);
        studentInfo.put("Foysal", 32);

        for (String k : studentInfo.keySet()){
            System.out.println("keys of studentInfo : " +k);
        }

        for (int v : studentInfo.values()){
            System.out.println("values of studentInfo :" + v);
        }

       for (String s : studentInfo.keySet()){
           System.out.println("keys of studentInfo : " + s + ", values of studentinfo : " + studentInfo.get(s) + " !!");
       }
        System.out.println("size of studentinfo : " + studentInfo.size());
        System.out.println("size of studentinfo : " + studentInfo.containsKey("Amin"));

        System.out.println(studentInfo);
    }

}
