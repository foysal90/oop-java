package array;

public class demo6 {
    public static void main(String[] args) {
//        using normal array method
        int [][] num = new int[2][3];

        num [0][0] = 10;
        num [0][1] = 20;
        num [0][2] = 30;
        num [1] [0] = 50;
        num [1] [1] = 60;
        num [1][2] = 70;

        System.out.println(num[0][0]);
        System.out.println(num[0][1]);
        System.out.println(num[0][2]);
        System.out.println(num[1][0]);
        System.out.println(num[1][1]);
        System.out.println(num[1][2]);



//        using for loop

        int [] [] num1 = new int[2][3];
        num1 [0][0] = 10;
        num1 [0] [1] = 20;
        num1 [0] [2] = 30;

        num1 [1][0] = 50;
        num1[1][1] = 60;
        num1[1][2] = 70;

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col <3 ; col++) {
                System.out.print(" " + num1[row][col]);

            }
            System.out.println();

        }








    }
}
