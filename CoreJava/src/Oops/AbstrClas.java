package Oops;

 abstract class Animal{
   abstract void sound();
   abstract void run();
    abstract void name();
    abstract void king();
   abstract void largeAnimal();


}

class First extends Animal{
     void sound(){
         System.out.println("dog is barking");
         System.out.println("all animal all other other sounds");
     }
     void run(){
         System.out.println("dog is running");
         System.out.println("jaguar is very fast in all other animals");
     }
     void name(){
         System.out.println("dog");
         System.out.println("Tiger");
         System.out.println("chittah");
         System.out.println("cat");
         System.out.println("all others");
     }

     void king(){
         System.out.println("Tiger is king of jungle");
     }
     void largeAnimal(){
         System.out.println("Elephent is large animal");
     }
}


public class AbstrClas {
    public static void main(String[] args) {

        First f=new First();
        f.sound();
        f.name();
        f.king();
        f.largeAnimal();
        f.run();

    }
}
