package CoreJavaPracticeMix;

class  Calculatror{
    int add(int a, int b){
        return a+b;

    }
    double add(double a, double b){
        return a+b;
    }
}

public class CompliletilePolymor {
    public static void main(String[] args) {
        System.out.println("this is a polymorphism ");
        System.out.println("This is a compile time polymorphism");
        Calculatror cl=new Calculatror();
        System.out.println( cl.add(10,52));
        System.out.println(  cl.add(15.25,45.9));

    }
}
