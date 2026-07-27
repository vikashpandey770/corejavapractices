class Mother{
    void property(){
        System.out.println("this is all property owner mother");
    }
}
class Brother extends Mother{
    void getPro(){
        System.out.println("get 50% property in son");
    }
}
class Sister extends  Mother{
    void getsis(){
        System.out.println("get 50% property owner sister");
    }
}
public class HerarchiInheritance {
    public static void main(String[] args) {
        Sister sp=new Sister();
        sp.property();
        sp.getsis();

        Brother br=new Brother();
        br.getPro();
        System.out.println();
    }
}