package Oops;

class Ek{
int a;
public int getC(){
    return a;
}

Ek(int a){
  this.a=a;
}
    public int one(int v){
    return 1;
    }
}

public class ThisKeyWord {
    public static void main(String[] args) {
        System.out.println("this keyword");
        Ek e=new  Ek(10);
        System.out.println(e.getC());
    }
}
