package CoreJavaPracticeMix;

class animal{
    void jungle(){
        System.out.println("this is stay of all animal");
    }
}

class dog extends animal{
    void jungle(){
        super.jungle();
        System.out.println("This is a dog class");
    }
}
class cat extends dog{
    void jungle(){
        super.jungle();
        System.out.println("this is a cat class");
    }
}
public class methodoverrideprogram {
    public static void main(String[] args) {
        System.out.println("override program");
        cat c=new cat();
        c.jungle();

    }
}
