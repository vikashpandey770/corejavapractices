package Oops;

import java.util.Scanner;

class State{

    static int a;
    void SetA(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a :");
        a=sc.nextInt();
    }
void GetA(){

    System.out.println("A:"+a);
}


}

public class StaticVariable {
    public static void main(String[] args) {
        System.out.println("this is a static variable");

        State s=new State();
        State s1=new State();
        State s2=new State();

        s.SetA();
        s1.SetA();
        s2.SetA();
        s.GetA();
        s1.GetA();
        s2.GetA();

    }
}
