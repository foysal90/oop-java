package mapDemo;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<String> voterList = new HashSet<>();

        voterList.add("Foysal");
        voterList.add("Amin");
        voterList.add("Masum");
        if (voterList.contains("foysal")){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        for (String x : voterList){
            System.out.println(x);

        }
    }
}
