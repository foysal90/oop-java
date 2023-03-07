package paramitized;

public class student  {
    public static void main(String[] args) {

        teacher t1 = new teacher();
        t1.setInfo("foysal", "male", 32);
        t1.display();

        teacher t2 = new teacher();
        t2.setInfo("amin","male", 33);
        t2.display();

        teacher t3 = new teacher();
        t3.setInfo("masum", "male", 33);
        t3.display();



    }


}
