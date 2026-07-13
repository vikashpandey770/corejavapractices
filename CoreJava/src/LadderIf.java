import java.util.Scanner;

public class LadderIf {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a city: ");
        String city=sc.nextLine();


       if(city.equals("agra")){
           System.out.println("true city");
       }
       else if (city.equals("jaipur")) {
           System.out.println("city of rajasthan");

       }
      else if(city.equals("vadodara")){
           System.out.println("gujarat city's");
       }

        else {
            System.out.println("not found");
        }
    }
}
