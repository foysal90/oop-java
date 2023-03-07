package inheritance;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name ="SAIRA";
        t1.age = 2;
        t1.gender = "Female";
        t1.display2();

        Student s1 = new Student();
        s1.name = "Aisha";
        s1.age = 4;
        s1.gender = "Female";
        s1.id = 101;
        s1.display3();

        person p1 = new person();
        p1.name = "Foysal";
        p1.age = 33;
        p1.display1();
    }
}
