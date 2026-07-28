package Oops;

import static Oops.State.a;

class dafalt {
    dafalt() {
        System.out.println("this is defalut");
    }

    dafalt(int a) {
this();
        System.out.println("this a your age:" +a);
    }
}
public class This_default_paramerize {
    public static void main(String[] args) {
        System.out.println("---------------------this is a default constructor or parameterize----------------------");
      dafalt d=new dafalt(25);

    }
}