package stringdemo;

public class reverseString {
    public static void main(String[] args) {
        // reverse a string without reverse()
        String country = "Bangladesh";
        String rev = "";

        for (int i = country.length()-1; i >=0 ; i--) {
            rev += country.charAt(i);

        }
        System.out.println("Reverse of Bangladesh is : " + rev);


        // reverse using stingBuffer and reverse()

        String fruit = "Apple";

        StringBuffer  f = new StringBuffer(fruit);
        f.reverse();
        System.out.println("Reverse of Fruit is : " + f);
    }
}
