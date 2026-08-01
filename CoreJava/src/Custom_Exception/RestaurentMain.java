package Custom_Exception;

import java.util.Scanner;

public class RestaurentMain {
    public static void main(String[] args) throws RestaurentCustomExce {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a order amount: ");
        int price= sc.nextInt();

        Restaurent r=new Restaurent();
   try {

       r.minimumOrder(price);
   }catch (RestaurentCustomExce e){
       System.out.println("your order amount is lower");
   }
   finally {
       System.out.println("ok , visit again");
   }

    }
}
