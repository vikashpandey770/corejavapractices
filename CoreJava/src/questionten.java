import java.util.Scanner;

public class questionten {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  a name:");
        String name=sc.nextLine();

        System.out.println(name.toLowerCase());
        System.out.println(name.replace(" ","_"));
    }
}
