package stringdemo;

public class demo1 {
    public static void main(String[] args) {
        String s1 = "bangladesh amr";
        String s2 = new String("Bangladesh amr");

        char [] s3 = {'a','m','i'};

        int len = s1.length();
        System.out.println(len);

        boolean s4 = s1.contains("amr");
        System.out.println(s4);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
//        if (s1==s2)
        if (s1.equalsIgnoreCase(s2)){
            System.out.println("equals");
        }
        else{
            System.out.println("not equals");
        }





        if (s1.equals(s2)){
            System.out.println("equals");
        }
        else{
            System.out.println("not equals");
        }


    }
}

