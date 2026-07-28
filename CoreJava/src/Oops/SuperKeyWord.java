package Oops;

class Nepal{
    void coun(){
        System.out.println("hellp nepal country");
    }

}
class Kathmandu extends Nepal{
    void coun(){
        super.coun();
        System.out.println("this is capital of nepal : kathmandu");
    }
}
class Butval extends Kathmandu{
    void coun(){
        super.coun();
        System.out.println("this is a state : butval");
    }
}
public class SuperKeyWord {
    public static void main(String[] args) {
        System.out.println("super key word");
        Butval b=new Butval();
        b.coun();
    }
}