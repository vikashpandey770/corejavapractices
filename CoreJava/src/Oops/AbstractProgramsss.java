package Oops;

abstract class Don{

  abstract void runs();

}
class Fast extends Don{
    public void runs(){
        System.out.println("this is a simple way to create RUNS");
    }

}
public class AbstractProgramsss {

    public static void main(String[] args) {
        System.out.println("----------------  Abstraction Program  ---------------");

        Fast f=new Fast();
        f.runs();

    }

}
