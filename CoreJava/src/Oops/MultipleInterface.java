package Oops;

 interface Father{
     void propertys();
 }

 interface  Mother {
     void house();

 }

 class  Son implements Father,Mother{
     public void propertys(){
         System.out.println("villeage property owner father");
     }
     public void house(){
         System.out.println("house property owner mother");
     }
 }
public class MultipleInterface {
    public static void main(String[] args) {
        System.out.println("multiple interface in singke progrmam : create a to 2 interface and call one single class ");
        Son s=new Son();
        s.propertys();
        s.house();

    }
}
