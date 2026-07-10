import java.util.Scanner;

public class QuestionIncomeTaxCALCU {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter your Total income in year:");
        double income=sc.nextDouble();

        if(income>250000 && income<500000){

            double tax=income*5/100;
            System.out.println("you are pay for:"+tax);
            double safe= income-tax;
            System.out.println("net income"+safe);
        }

       else if(income>500000 && income<1000000){
            double tax=income*20/100;
            System.out.println("you are pay for:"+tax);
            double safe= income-tax;
            System.out.println("net income"+safe);


        }
      else if(income>1000000){
            double tax=income*30/100;
            System.out.println("you are pay for:"+tax);
            double safe= income-tax;
            System.out.println("net income"+safe);


        }
      else {
            System.out.println("total income save");
        }

    }
}
