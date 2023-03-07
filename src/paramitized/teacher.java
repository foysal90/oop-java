package paramitized;

public class teacher {

    String name,gender;
    int age;

    void setInfo (String n, String g, int a){
        name = n;
        gender = g;
        age = a;


   }

   void display (){
       System.out.println("Name: " + name);
       System.out.println("Gender: " +gender);
       System.out.println("Age: " + age);
       System.out.println("\n");
   }
}
