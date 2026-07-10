import java.util.Scanner;

public class gradehide {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Your Total mark:");
        int mark=sc.nextInt();

        System.out.println("your total sub:");
        int sub=sc.nextInt();

        float grade=mark/sub;
        float grades= grade/10;
        float add=grades+8;
        System.out.println("your grade:"+add);

    }
}
