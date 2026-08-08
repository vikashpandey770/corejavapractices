package CoreJavaPracticeMix;

class Cycle{
    void run(){
        System.out.println("run the cycle");
    }

}
class Bullet extends Cycle{
    void run(){
        super.run();
        System.out.println("this a bullet bike");
    }
}
public class RuntimePolymorphism {

    public static void main(String[] args) {
        System.out.println("Run time polymorphism");

        Bullet b=new Bullet();
        b.run();

    }
}
