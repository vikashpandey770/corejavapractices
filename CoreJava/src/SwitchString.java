import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a level:");
        String sr=sc.nextLine();

        switch (sr){
            case "Beginner":
                System.out.println("1"
                );
                break;
            case "intermediate":
                System.out.println("2");
                break;
            case "expert":
                System.out.println("3");
                break;
            default:{
                System.out.println("000");
            }
        }


    }
}
