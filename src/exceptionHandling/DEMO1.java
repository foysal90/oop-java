package exceptionHandling;


//single line exception handling
public class DEMO1 {
    public static void main(String[] args) {
        try {
            int [] num = new int[5];

            num[5] = 10;
            System.out.println(num);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);

        }
        finally {
            System.out.println("lets print something else");
        }

    }
}
