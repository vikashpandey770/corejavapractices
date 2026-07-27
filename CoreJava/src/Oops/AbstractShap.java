package Oops;

abstract class  Shape{
    abstract void draw();

    void ru(){
        System.out.println("run all method");
    }
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("draw the ractangle");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("draw the circle");
    }
}

class Box extends Shape{
    void draw(){
        System.out.println("draw the box");
    }
}

public class AbstractShap {
    public static void main(String[] args) {
        System.out.println("All shap is here only one method use");

        Box b=new Box();
        b.draw();
        b.ru();

        Circle c=new Circle();
        c.draw();

        Rectangle r=new Rectangle();
        r.draw();
        r.ru();
    }
}
