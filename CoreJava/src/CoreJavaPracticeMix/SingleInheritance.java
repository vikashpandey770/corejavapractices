package CoreJavaPracticeMix;

class dogg{
    void eat(){
        System.out.println("barking............");
    }
}
class catt extends dogg{
    void eat(){
        System.out.println("cat eat a non veg");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {

        catt c=new catt();
        c.eat();
    }
}
