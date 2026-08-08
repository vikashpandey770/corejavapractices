package CoreJavaPracticeMix;

class overld{
    void done(int x){
        System.out.println("this is a first method");
        System.out.println(x);
    }

    void done(int x, String name){
        System.out.println("this is a second method");
        System.out.println(x +name);
    }
}

public class Methooverload {
    public static void main(String[] args) {
        System.out.println("this is a method overload program ");
        overld o=new overld();
        o.done(23);
        o.done(32,"vikash");

    }
}
