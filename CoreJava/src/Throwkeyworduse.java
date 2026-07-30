import java.io.IOException;
import java.util.Scanner;
public class Throwkeyworduse {
    public static void ram() throws ArithmeticException, IOException,ArrayIndexOutOfBoundsException {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a age:");
        age = sc.nextInt();
            if (age > 60) {
                System.out.println("your are sinior citizen ship category");
            } else {
                throw new ArithmeticException();
            }
        }
    public static void main(String[] args) {
        System.out.println("-------------this is a throw key word---------------");
        try {
            ram();
        }
catch (Exception e){
    System.out.println("this is a error part:"+e);
}
        finally {
            System.out.println("ok complete and exit the program here");
        }
    }
}

