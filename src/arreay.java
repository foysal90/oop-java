public class arreay {
    public static void main(String[] args) {
        int a[] = new int[] {50,20,30,80,10};

        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i]> max){
                max = a[i];
            }

        }
        System.out.println("Largest element in an array : " + max);

        int [] num = new int[5];
        for (int i = 0; i <num.length; i++) {
            System.out.println(num[i]);

        }
    }
}
