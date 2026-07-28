package Oops;

class AA{
    AA(){
        this(10);

        System.out.println("hell AA");
    }
    AA(int a){
        System.out.println("a:"+a);
    }
}

public class This_paramererDefalt {
    public static void main(String[] args) {
        System.out.println("hello world");

        AA x=new AA();


    }
}
