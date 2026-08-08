package CoreJavaPracticeMix;

import java.util.Scanner;

class Studentss{

    int rollno;
    String name;
    static String college="silver oak";

    static  void change(){
        college="silver oak university";
    }

    Studentss(int r,String n){
        rollno=r;
        name=n;


    }


    void dis(){
        System.out.println("your name is: "+name+" and roll no :"+rollno+"and college name :"+college);
    }
}

public class StatckMethods {
    public static void main(String[] args) {

        Studentss.change();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a Roll no: ");
        int rollno=sc.nextInt();
        System.out.println("Enter a name: ");
        String name=sc.next();
        Studentss s=new Studentss(rollno,name);
        s.dis();
    }
}
