import java.util.Scanner;

public class doneorgdotIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a website:");
           String name = sc.nextLine();

           if(name.endsWith(".org")){
               System.out.println("this is organization website");
           }

           else if(name.endsWith(".in")){
               System.out.println("indian website");
           }
           else if(name.endsWith(".com")){
               System.out.println("commercial website");
           }
           else {
               System.out.println("rong keyword");
           }
    }
}