package exceptionHandling;

public class demo2 {
    public static void main(String[] args) {
        //multiple exception handling

        try {
            String [] names = new String[4];
            names[4] = "Bangladesh"; //will throw an error

            for (int i = 0; i < names.length; i++) {
                System.out.println(names[i]);
            }




        } catch (ArithmeticException a){
            System.out.println("Exception1 : " + a);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception2 : " + e);
        }

        finally {
            System.out.println("SHOULD I print something");
        }
    }
}
