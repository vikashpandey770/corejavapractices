import java.util.Scanner;

public class TableMulSum {

    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a table:");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++) {
            sum += n * i;
        }
        System.out.println(sum);
    }
}
