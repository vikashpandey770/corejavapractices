package CoreJavaPracticeMix;

class javas{

    void topics(){
        System.out.println("there a many topics in the java");
    }

}
class C extends javas{
    void topics(){
        super.topics();
        System.out.println("This is a c++ language progam ");
    }
}

public class Methodoverriding1 {
    public static void main(String[] args) {
        System.out.println("------------ This is a method  overrididng program ----------");

        C cs=new C();
        cs.topics();
    }
}
