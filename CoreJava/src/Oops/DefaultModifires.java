package Oops;

class Defal{

    int age=20;
    String names="pandey vikash";

    void dro(){
        System.out.println(age);
        System.out.println(names);
    }



}


public class DefaultModifires {
    public static void main(String[] args) {
        System.out.println("this is a default modifires");

        Defal d=new Defal();
        d.dro();

    }
}
