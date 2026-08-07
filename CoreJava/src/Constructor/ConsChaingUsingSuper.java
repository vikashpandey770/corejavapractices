package Constructor;

class  Kpmg{
    Kpmg(){
        System.out.println("this is a default constructor");
    }

}

class  father extends Kpmg{

    father(){
        super();
        System.out.println("This  is a child class ");
    }
}
public class ConsChaingUsingSuper {
    public static void main(String[] args) {
        System.out.println("this is a constructor using super key word");

        father f=new father();

    }
}
