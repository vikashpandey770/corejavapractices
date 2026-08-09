package CollectionsFra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Stuudent{

    String name;
    int roll;
    int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}


public class ComparatorMarksStu implements Comparator<Stuudent> {


    @Override
    public int compare(Stuudent s1, Stuudent s2) {

        int value=0;
        if(s1.getMarks()>s2.getMarks()){
            value=1;
        }
        else if(s1.getMarks()<s2.getMarks()){
            value =-1;

        }
        else if(s1.getMarks()== s2.getMarks()){
            value=0;
        }



        return value;
    }



    public static void main(String[] args) {


        System.out.println("-----------------  Student marks comparator  ----------------");

        ArrayList<Stuudent> list=new ArrayList<>();
Stuudent s1=new Stuudent();
s1.setName("vikash");
s1.setRoll(23);
s1.setMarks(78);

Stuudent s2=new Stuudent();
        s2.setName("vikram");
        s2.setRoll(32);
        s2.setMarks(88);

        Stuudent s3=new Stuudent();
        s3.setName("vijya");
        s3.setRoll(44);
        s3.setMarks(28);


        Stuudent s4=new Stuudent();
        s4.setName("karan");
        s4.setRoll(23);
        s4.setMarks(78);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

      //  Collections.sort(list,new Comparatorsprogram());
        for(Stuudent s:list){

            System.out.println(s1.getName());
            System.out.println(s1.getMarks());
            System.out.println(s1.getRoll());
        }


    }




}
