package Oops;

class  Paren{
    protected  int age=35;

    void aged(){
        System.out.println("your age is:"+age);
    }

    void ads(){
        aged();
    }
}

public class ProtectedModfire {
    public static void main(String[] args) {
        System.out.println("this is protected modifires");

        Paren p=new Paren();
        p.ads();

    }
}
