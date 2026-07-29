package Oops;

class Pri{
  private void ages(){
        System.out.println("my age is 25 year old");
        System.out.println("this is a private access modifires");
    }

public void sh(){
      ages();
}
}

class Nex{
    void addd(){
        System.out.println("this is a not call from private property from another class");

    }

}

public class Private_ac_m {
    public static void main(String[] args) {
        System.out.println("this is a private access modifires");

        Nex n=new Nex();
        n.addd();

        Pri pr=new Pri();
        pr.sh();

    }

}

