package exceptionHandling;

public class demo2 {
    public static void main(String[] args) {
        //multiple exception handling

        try {
            String [] names = new String[4];
            names[4] = "Bangladesh"; //will throw an error

            System.out.println(names);
        } catch (ArithmeticException a){
            System.out.println("Exception : " + a);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception : " + e);
        }
        finally {
            System.out.println("SHOULD I print something");
        }
    }
}
