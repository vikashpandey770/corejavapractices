package Pack1;

public class Objvala {
    Objvala() {
        Transaction t = new Transaction();
        System.out.println(" -----------------Object class:----------------");
        System.out.println("this is a default a: "+t.a);
        System.out.println("this ia a public a: "+t.ab);
        //  System.out.println("this is a private ac: "+t.ac);
        System.out.println("this is a protected ad: "+t.ad);

    }
    public static void main(String[] args) {
        Derive d=new Derive();
        Objvala o=new Objvala();
    }
}
