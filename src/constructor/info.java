package constructor;

public class info {
    public static void main(String[] args) {
        overloading p1 = new overloading("xyz","orlando");
        p1.displayInformation();

        overloading p2 = new overloading("abc","florida",101);
        p2.displayInformation();
    }
}
