package Oops;

abstract class Vehicles{
     Vehicles(){
        System.out.println("all vehicle is use to tyres");
    }

    abstract void run();
    void Faster(){
        System.out.println("vehicle is faster than cycle");
    }
}

class Cars extends Vehicles{
    void run(){
        System.out.println("run is any vehicle use the key");
    }
}

public class AbstactWithConstructor {
    public static void main(String[] args) {

        Cars c=new Cars();
            c.Faster();
            c.run();
    }
}
