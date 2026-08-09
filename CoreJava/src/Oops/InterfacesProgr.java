package Oops;


interface Animall{
    void eat();

}

class  Dog implements Animall{

    public void eat(){
        System.out.println("eating a cook");
    }

}
public class InterfacesProgr {
    public static void main(String[] args) {

        System.out.println("Inter face Program");

        Dog d=new Dog();
        d.eat();
    }
}
