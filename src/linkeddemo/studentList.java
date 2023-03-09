package linkeddemo;

import java.util.LinkedList;

public class studentList{
    public static void main(String[] args) {
        LinkedList<student> list = new LinkedList<student>();


        student s1 = new student("foysal","12","orlando",33,101);
        student s2 = new student("masum","12","orlando",33,102);
        student s3= new student("amin","12","orlando",35,103);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (student s : list){
            System.out.println("Name  : " + s.name + ", Grade : " +s.grade + ", Address : " + s.address + ", Age : " + s.age + ", ID : " + s.id);
        }


    }


}
