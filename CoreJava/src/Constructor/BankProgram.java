package Constructor;

import java.util.Scanner;

class banker{

    int account_number;
    int balace;
    String name;

    banker(int a,int b,String n){
        this.account_number=a;
        this.balace=b;
        this.name=n;


    }

    void print(){
        System.out.println("Account number: "+account_number);
        System.out.println("balance :"+balace);
        System.out.println("name : "+name);
    }
}


public class BankProgram {
    public static void main(String[] args) {
        System.out.println("this is a bank program");
        System.out.println("******************************");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a account no: ");
        int account_number=sc.nextInt();

        System.out.println("enter a balance :");
        int balance=sc.nextInt();

        System.out.println("Enter a name :");
        String name=sc.next();

        banker b=new banker(account_number,balance,name);

        b.print();




    }
}
