import java.util.Scanner;

public class IncrimentDecriment {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    System.out.println("number is:"+num);
    num++;
    System.out.println(num);//11
    ++num;
    System.out.println(num);//12
}
}