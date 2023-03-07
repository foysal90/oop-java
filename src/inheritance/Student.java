package inheritance;

public class Student extends Teacher{
    int id;

    void display3 (){
        display2();
        System.out.println("ID :" + id);
    }
}
