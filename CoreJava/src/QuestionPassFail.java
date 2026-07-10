import java.util.Scanner;

public class QuestionPassFail {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=--------------------PASS FAIL MARK PROGRAM------------------------");
        System.out.println("----------Enter a Subject Mark----------- ");
        System.out.println("Math:");
        int m = sc.nextInt();
        if (m < 0 || m > 100) {
            System.out.println("error");
            return;
        }


        System.out.println("Science:");
        int s = sc.nextInt();
        if (s < 0 || s > 100) {
            System.out.println("error");
            return;
        }

        System.out.println("English:");
        int e = sc.nextInt();
        if (e < 0 || e > 100) {
            System.out.println("error");
            return;
        }

        if (m < 34) {
            System.out.println("MATH FAIL");
        }


        if (s < 34) {
            System.out.println("SCIENCE FAIL");
        }

        if (e < 34) {
            System.out.println("ENGLISH FAIL");
        }


        int total = m + s + e;
        //  System.out.println(total);
        if (m > 33 && s > 33 && e > 33) {
            int percent = total * 100 / 300;
            System.out.println(percent + "%");
        }
        else{
            System.out.println("You are a fail sorry not provide percentage");
        }
    }

}