package constructor;

public class overloading {
    String name,address;
    int id;

//    overloading (){
//        String gender = "male";
//        System.out.println("Gender :" + gender);
//    }

    overloading (String n, String a){
        name = n;
        address = a;
    }

    overloading (String n, String a, int i){
        name = n;
        address = a;
         id = i;
    }

    void  displayInformation (){
        System.out.println("Name: " + name);
        System.out.println("Address :" + address);
        System.out.println("Id :" + id);
        System.out.println();
    }
}
