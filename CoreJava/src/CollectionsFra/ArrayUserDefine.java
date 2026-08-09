package CollectionsFra;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayUserDefine {
    public static void main(String[] args) {
        System.out.println("User define name");

        Scanner sc=new Scanner(System.in);
        ArrayList<String> list= new ArrayList<>();
        System.out.println("how many data add : ");
        int n=sc.nextInt();

        for(int i=0;i<=n;i++){
            System.out.print("Enter name: "+(i+1)+":");
            String name=sc.next();
            list.add(name);


        }
        System.out.println(list);
        System.out.println("-------------names in array list--------------");
        for(String sp:list){
            System.out.println(sp);
        }


    }
}
