import java.util.Scanner;

public class FactorialWhileloop {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number:");
        int num=sc.nextInt();
        int i=1;
        int facto=1;
        while(i<=num){

            facto*=i;
            i++;
         }
        System.out.println(facto);
    }
}
