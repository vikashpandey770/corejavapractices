package Pack1;

public class Transaction {
    int a =10;
    public int ab=24;
    private int ac=34;
    protected int ad=5;

    Transaction(){
        System.out.println("this is a default constructor");
        System.out.println("this is a default a: "+a);
        System.out.println("this ia a public a: "+ab);
        System.out.println("this is a private ac: "+ac);
        System.out.println("this is a protected ad: "+ad);

    }
}
