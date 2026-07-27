package JavaPrograms;

import java.util.Scanner;

public class numPatteern {

    public  static void master(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int nm=sc.nextInt();

        for(int i=1;i<=nm;i++){
            for (int j=1;j<=nm;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
    
    }
}
