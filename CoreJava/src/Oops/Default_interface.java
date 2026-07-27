package Oops;

interface Softskill{
    void speak();

    default void teacher(){
        System.out.println("Hello everyone , good morning of all");
    }
}
class Stud implements Softskill{
    public void speak(){
        System.out.println("all student is a large voice speak in hindi and english languages");

    }
}
public class Default_interface {
    public static void main(String[] args) {
        System.out.println("--------------- this is default interface using program ------------");

        Stud s=new Stud();
        s.teacher();
        s.speak();
    }
}