import java.util.Scanner;

public class badix {


        String productName;
        double price;

        public void product(String pr,double p) {
            productName=pr;
            price=p;

        }

        void print() {
            System.out.println("product name is:"+productName);
            System.out.println("price is :"+price);

        }
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Product name: ");
            String productName=sc.nextLine();

            System.out.println("enter price :");
            int price=sc.nextInt();

             badix s=new badix();
            s.product(productName, price);
            s.print();

        }
    }




