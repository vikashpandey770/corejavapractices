import java.util.Scanner;

public class FindUserFactorial {
    public static void main(String args[]){
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("numbeR:");
        int num=sc.nextInt();

        for(int i=1;i<=num;i++){
            fact *=i;
        }
        System.out.println(fact);
    }
}
