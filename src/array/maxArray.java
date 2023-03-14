package array;

public class maxArray {
    public static void main(String[] args) {
        int [] num = {50,20,10,60,80,5};
        int m = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i]>m){
                m = num[i];
            }

        }
        System.out.println("Maximum of Num = " + m);
    }
}
