package HomeWork;

public class test {
    public static void main(String[] args) {
        overload ob = new overload();
        ob.display(); // this is non parameterized method
        ob.display("Foysal", "Orlando");  // this is string parameterized method
        ob.display(32,101);  // this is integer parameterized method
        System.out.println();

        override ob1 = new override1(); // Displaying super/ parents  class
        ob1.name = "XYZ";
        ob1.age = 18;

        ob1.displayInfo();
        System.out.println();

        override1 ob2 = new override1(); // displaying sub/ child class

        ob2.name = "ABC";
        ob2.age = 21;
        ob2.gender = "Male";
        ob2.id = 102;

        ob2.displayInfo();

    }
}
