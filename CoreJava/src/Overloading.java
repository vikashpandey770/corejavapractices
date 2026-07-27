import java.util.Scanner;

public class Overloading {
static  void done(int array[]){
    array[0]=150;
}

static void foo(){
    System.out.println("good morning everyone");
}

static void foo(int x,int y,int z){
    System.out.println(x*y*z);
}

static void foo(int a){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a age:");
    a=sc.nextInt();
    System.out.println("your age is:"+a);

}


static void foo( String name){
    System.out.println("your name is :"+name);

}
    public static void main(String[] args) {

    int array[]={45,65,89,35,42,20,53};

        done(array);
        System.out.println(array[0]);

        // method overloading

foo();
foo(58);

  foo(10,10,10);
foo("vikash pandey");
    }
}
