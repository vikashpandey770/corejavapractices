package CoreJavaPracticeMix;

class vehicle{
    void run(){
        System.out.println("any vehical is running");
    }

}
class Bike extends vehicle{
    void run(){
        System.out.println("bike is running fast");
    }
}
class Car extends vehicle{
    void run(){
        super.run();
        System.out.println("car is running fast");
    }
}

public class Inheritance_oveririding {
    public static void main(String[] args) {

        Car c=new Car();
        c.run();

        Bike b=new Bike();
        b.run();


    }
}
