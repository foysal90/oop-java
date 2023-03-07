package HomeWork;

public class overload {
    void display (){
        System.out.println("i will not display anything here....");
    }

    void display (String name, String address){
        System.out.println("Hello my name is " + name + " and i live in " + address);

    }

    void display (int age, int id) {
        System.out.println("I am " + age + "years old and my id number is " + id);
    }
}
