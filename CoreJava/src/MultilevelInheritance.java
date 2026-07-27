class A{
    void run(){
        System.out.println("Today heavy rain in ahmedabad");
    }
}

class B extends A{
    void leave(){
        System.out.println("leave in a all school today");
    }

}

class  C extends B{
    void home(){
        System.out.println("All student work from home work");
    }
}


public class MultilevelInheritance {
    public static void main(String[] args) {
        C c2=new C();
        c2.run();
        c2.leave();
        c2.home();
        System.out.println("This is multiple inheritance");
    }
}
