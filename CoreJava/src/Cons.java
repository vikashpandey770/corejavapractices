class Fom{

    Fom(){
        System.out.println("this is a default constructors");

        String name;
        int rollno;
    }


    Fom(String n){
       String  name=n;
        System.out.println(name);
    }
Fom(int no){
    System.out.println(no);

}



}


public class Cons {
    public static void main(String[] args) {
        Fom f2=new Fom();

        Fom f=new Fom( "this is a paramerrize constructors "+ "vikash");


        Fom fp=new Fom(10);
    }
}
