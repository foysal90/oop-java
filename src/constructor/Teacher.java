package constructor;

public class Teacher {
    public static void main(String[] args) {
        person p1 = new person("Foysal ahmed", "male", 32);
        p1.display();

        person p2 = new person("Amin", "male", 33);
        p2.display();

        person p3 =new person("Aisha ahmed", "female", 4);
        p3.display();
//
//        overloading p4 = new overloading();
//        p4.displayInformation();
//
//        overloading p5 = new overloading("Saira","Orlando");
//        p5.displayInformation();
//
//        overloading p6 = new overloading("Rehana", "Florida", 101);
//        p6.displayInformation();

        returnValue p7 = new returnValue();
        int result = p7.square(5);
        System.out.println("Square of = " + result);

        returnValue p8 = new returnValue();
        int res = p8.square(7);
        System.out.println("Square of 7 = " + res);


    }
}
