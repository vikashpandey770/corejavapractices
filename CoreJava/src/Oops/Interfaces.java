package Oops;

interface Vehicle{
    void start();
    void stop();

     default void news(){
        System.out.println("aaj tak news");
    }
}

class Bike implements  Vehicle{
    public void start(){
        System.out.println("start the bike");
    }
    public  void stop(){
        System.out.println("Stop the bike");
    }
}

class Car implements Vehicle{
    public  void start(){
        System.out.println("Car is start");
    }

    public  void stop(){
        System.out.println("car is stop");
    }
}

public class Interfaces {
    public static void main(String[] args) {

        Bike b=new Bike();
        b.start();
        b.stop();
        b.news();

        Car c=new Car();
        c.start();
        c.stop();
    }
}
