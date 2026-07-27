package JavaPrograms;
import java.sql.SQLOutput;

import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {

        double balance=5000, withdraw, deposite;
        Scanner sc=new Scanner(System.in);
        while (true){

            System.out.println("ATM Program");

            System.out.println("Choose 1. for Withdraw:");
            System.out.println("Choose 2. for Deposite:");
            System.out.println("Choose 3.for check Balance:");
            System.out.println("Choose 4.for Exit:");
            System.out.println("choose the operation you want to perform");


            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter money to withdraw");
                    withdraw= sc.nextInt();
                    if(balance>=withdraw){
                        balance=balance-withdraw;
                        System.out.println("Please collect your money");
                        System.out.println("Your available balance is : "+balance);
                    }
                    else {
                        System.out.println("insuffician balance");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.println("Enter money to diposite");
                    deposite=sc.nextInt();
                    balance=balance+deposite;
                    System.out.println("your money has been successfully added");
                    System.out.println("");
                    break;
                case 3:

                    System.out.println("Balance:"+balance);
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
            }

        }
    }
}