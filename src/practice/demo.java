package practice;

public class demo {
    public static void main(String[] args) {
        // regular way of arrays
//        int [] a = new int[5];
//
//        a[5] = 20;
//
//        System.out.println("result" + a);
//        System.out.println("hello");

        try{
            int [] a = new int[5];

            a[5] = 20;

            System.out.println("Result : " + a);
        }catch (Exception e){
            System.out.println("Exception of E :    " +e);

            System.out.println("Hello");
        }
        finally {
            System.out.println("world");
        }

    }

}
