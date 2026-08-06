    package Custom_Exception;

    import java.util.Scanner;

    public class MultipleCatchBlock {
        public static void main(String[] args) {
            System.out.println("****This program is create a Multiple catch block *****");

            Scanner sc=new Scanner(System.in);
            try {
                System.out.println("Enter a balacne: ");
                double balance = sc.nextDouble();

                System.out.println("Enter a product value:");
                double value = sc.nextDouble();

                if(value>balance){
                    throw  new Exception();
                }
                else {
                    System.out.println("Ok debit the amout");
                    double sr=balance-value;
                    System.out.println("Available balance: "+sr);
                }
            }catch (Exception e){
                System.out.println("error "+e);
            }

        }
    }
