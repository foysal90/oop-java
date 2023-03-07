package array;

import java.util.Arrays;

public class demo9 {
    public static void main(String[] args) {
        int [] a = {50,10,20,65,15};

        Arrays.sort(a);

        for (int i = 4; i >= 0 ; i--) {
            System.out.println(a[i]);

        }
    }
}
