class  X{
    void food(){
        System.out.println("This is a parent");
    }
}
class Y{
    void eat(){
        System.out.println("eat a chiniese items");
    }
}
class  Z extends X{
    void fast(){
        System.out.println("today fast rain");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Z is=new Z();
        is.food();
        is.fast();

        Y and=new Y();
        and.eat();
        System.out.println();
    }
}
