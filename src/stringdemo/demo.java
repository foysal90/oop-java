package stringdemo;

public class demo {
    public static void main(String[] args) {
        String firstName = "         foysal ";
        String lastName = " ahmed";

        String country = "welcome to the united states of america";
        System.out.println("country = " +country);
        String r = country.replace("t","d");
        System.out.println("values after replacement of t = " + r); // replace made the changes to new variable but it doesnt effect in original variable

        String fullName = firstName.concat(lastName);
        System.out.println(fullName);



        boolean b = firstName.startsWith("F");
        System.out.println(b);

        boolean c = firstName.endsWith("a");
        System.out.println(c);

        char ch = firstName.charAt(0);
        System.out.println(ch);

        int value = firstName.codePointAt(0);
        System.out.println(value);

        String s3 = firstName.trim();
        System.out.println("trim = " + s3);
    }
}




