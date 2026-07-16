import java.util.Scanner;

public class whilefacto {
    public static void main(String[] args) {
        int facto=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int i=1;
        while (i<=n){
            facto*=i;
            i++;
        }
        System.out.println(facto);

    }
}
