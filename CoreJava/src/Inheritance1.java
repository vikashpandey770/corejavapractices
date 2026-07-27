
class  Parent{
    void bike(){
        System.out.println("this is a parent purchase a bike");
    }
}

class Child extends Parent{
    void use(){
        System.out.println("child not purchase new bike use in father bike");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {

        Child ch=new Child();
        ch.bike();
        ch.use();
        System.out.println("this is a simple  singal lavel inheritance");
    }
}
