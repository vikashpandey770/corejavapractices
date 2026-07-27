package Oops;

import java.util.Scanner;

interface Vikash{
    void name();
    static int salary(int x){
        return 0;
    }
}
class Sons implements Vikash{
    public void name(){
        System.out.println("my name is vikash pandey");
    }
    public int salary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("your salary is:");
        int x=sc.nextInt();
        System.out.println("your salary is :"+x);
return 0;
    }
}
public class Interface_Static {
    public static void main(String[] args) {
        System.out.println("-----------interface or static -------------");
        Sons s=new Sons();
        s.name();
        s.salary();
    }
}