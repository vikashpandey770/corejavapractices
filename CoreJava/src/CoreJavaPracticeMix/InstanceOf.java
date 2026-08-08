package CoreJavaPracticeMix;

class Dem{

    void sr(){
        System.out.println("This is a parent");
    }
}

class Nav extends Dem{
    void sr(){
        System.out.println("this is a child class");
    }
}

public class InstanceOf {
    public static void main(String[] args) {
        System.out.println("This is a instance of examples");
String name="vikash";

        Nav n=new Nav();
        System.out.println(n instanceof Nav);
        System.out.println(n instanceof Dem);
        System.out.println(name instanceof String);
    }
}
