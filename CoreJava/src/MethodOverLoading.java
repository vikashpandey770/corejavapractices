class  As{
    static void Abs(){
        System.out.println("java");
    }
    As(){
        System.out.println("java method over loading programs");
        System.out.println("and this is a multileve inheritance example and hyrarchi example");
    }


}
class Ab extends As{
    static  void Abs(){
        System.out.println("pythons");
    }
}

class  Sp extends As{
    static void Abs(){
        System.out.println("c++");
    }

}
public class MethodOverLoading {
    static void jock(){
        System.out.println("i invited a new world \nindia");
    }
    public static void main(String[] args) {
        jock();

        Sp s=new Sp();
        s.Abs();

    }
}