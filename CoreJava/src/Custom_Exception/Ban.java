package Custom_Exception;
import java.util.Scanner;
public class Ban {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("******************************");
        System.out.println("enter your Account Number:");
        int accNo=sc.nextInt();
        System.out.println("Enter Your Name :");
        String name=sc.next();
        System.out.println("Enter Initial Balance:");
        double balance= sc.nextInt();
        System.out.println("**************");

        AccountDatas aa=new AccountDatas(accNo,name,balance);

     while (true)
     {
         System.out.println();
         System.out.println("*********************** Choose One *************************");
         System.out.println("1. Diposite amount");
         System.out.println("2. Withdraw amount");
         System.out.println("3. Check Bank Balance");
         System.out.println("4. Exit");
         System.out.println("******************************");
         System.out.println("Enter your Choice: ");
         int choice=sc.nextInt();

         if(choice==1){
             System.out.println("Enter Diposite Amount :");
             double amount=sc.nextDouble();
             aa.diposite(amount);
         }

         else if(choice==2){
             System.out.println("Enter Withdraw amount: ");
             double amount=sc.nextDouble();
             try{
                    aa.withdraw(amount);

             }catch (BankProgramExceptions e){
                 System.out.println("This is a error provide , add a extra money:"+e.getAmount());
             }
             finally {
                 System.out.println("ok close the program here");
             }
         }

         else if(choice==3){
             System.out.println("your bank balance is:");
             aa.checkBalance();
         }

         else if(choice==4){
             System.out.println("Exit the system");
             System.out.println("****** ok close the program ******");
             break;
         }
     }
    }
}
