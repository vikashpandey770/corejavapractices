import java.util.Scanner;

public class dowhilefactorail {
    public static void main(String[] args) {

        int i=1;
        int fact=1;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a factorial number find:");
        int fa=sc.nextInt();

        do{

            fact*=i;
            i++;

        }while (i<=fa);
        System.out.println("this is a your factorial number find:"+fa);
        System.out.println(fa+ " factorial is " +fact);


    }
}
