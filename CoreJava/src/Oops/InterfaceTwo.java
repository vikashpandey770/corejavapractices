package Oops;
interface Schools{
    void teacher();

}

class One implements Schools{

    public void teacher(){
        System.out.println("total 50 teachers in the school");
    }
    }

class Two implements Schools{
    public void teacher(){
        System.out.println("25 gents teacher");
    }
}
class Three implements Schools{
    public void teacher(){
        System.out.println("25 ladies teacher");
    }
}
public class InterfaceTwo {
    public static void main(String[] args) {

        One o=new One();
        o.teacher();
        Two t=new Two();
        t.teacher();

        Three th=new Three();
        th.teacher();

    }
}
