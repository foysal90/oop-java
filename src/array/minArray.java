package array;

public class minArray {
    public static void main(String[] args) {
        int [] num = {50,5,100,200,1,3};
        int min = num[0];

        for (int i = 0; i <num.length ; i++) {
            if (num[i]< min){
                min = num[i];

            }

        }
        System.out.println("Minimum of Num = " + min);


    }
}
