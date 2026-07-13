import java.util.Scanner;

public class multiplicationtable {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a table:");
        int n=sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n+"X"+i+"="+n*i);
        }

        System.out.println("--------------REVERSE TABLE-------------");
        System.out.println("enter a table:");
        int nn=sc.nextInt();
        for(int j=10;j>=1;j--){
            System.out.println(nn+"X"+j+"="+nn*j);
        }


    }
}