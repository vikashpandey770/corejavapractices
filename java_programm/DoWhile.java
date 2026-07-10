import java.util.Scanner;

public class DoWhile {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A number:");
        int num=sc.nextInt();
        System.out.println("A:"+num);

        do{
            System.out.println(num);
            num++;
        }
        while (num<=50);

    }
}
