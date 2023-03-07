package inheritance;

public class Teacher extends person {

    String gender;

    void display2 (){
        display1();
        System.out.println("Gender: " + gender);
    }
}
