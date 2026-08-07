package Constructor;

class Defa{
    Defa(){
        System.out.println("This is a default constructor program");
        int a=10;
        int b=30;
        System.out.println("a+b: "+(a+b));
    }
}
public class DefaultProgram {
    public static void main(String[] args) {
        System.out.println("This is a Default constructor");
        Defa d=new Defa();
    }
}
