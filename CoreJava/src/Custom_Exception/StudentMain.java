package Custom_Exception;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) throws StudentCollegeAdmission
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your standard :");
        int std=sc.nextInt();

        Student s=new Student();
try {


    s.college(std);
}catch (StudentCollegeAdmission e){
    System.out.println("under qualifications");
}
finally {
    System.out.println("ok close the program13");
}

    }
}
