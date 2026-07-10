import java.util.Scanner;

public class gradingIfElseUse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a mark:");
        int mark=sc.nextInt();

        if(mark>=0 && mark<=100) {
            
            if (mark > 33 && mark < 50) {
                System.out.println("D");
            } else if (mark >= 50 && mark < 65) {
                System.out.println("C");
            } else if (mark >= 65 && mark < 80) {
                System.out.println("B");
            } else if (mark >= 80 && mark < 90) {
                System.out.println("A");
            } else if (mark >= 90 && mark <= 100) {
                System.out.println("A+");
            } else {
                System.out.println("fail");

            }
        }
    }
}
