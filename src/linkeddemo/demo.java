package linkeddemo;

import java.util.LinkedList;

public class demo {
    public static void main(String[] args) {
        LinkedList <String> countryName = new LinkedList<>();

        countryName.add("Afghanistan");
        countryName.add("pakistan");
        countryName.add("Bangladesh");
        countryName.add("srilanka");
        countryName.add("japan");


        boolean s = countryName.isEmpty();
        System.out.println(s);

        System.out.println(countryName);

        for (String country : countryName){
            System.out.println(country);
        }


    }
}
