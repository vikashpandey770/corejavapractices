package CoreJavaPracticeMix;

class one{
    void  ones(){
        System.out.println("This is a first method");
    }
}
class second extends one{
    void ones(){
        super.ones();
        System.out.println("this is a second method");
    }
}

public class MethodOverride {

    public static void main(String[] args) {
        System.out.println("This is a method overriding program");

        second s=new second();
        s.ones();
    }
}
