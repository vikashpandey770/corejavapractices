package Oops;

class Demo{
        int roll;
        String name;
            static String college="silver oak";

            Demo(int r,String n){
                name=n;
                roll=r;
            }
            void  display(){
                System.out.println(name+" ::" +roll + college);
            }

            static  void runer(){
                System.out.println("i am a fast runner");
            }
}


public class StaticVari {
    public static void main(String[] args) {
        System.out.println("---------------------This is a static variable--------------------------");
        Demo d=new Demo(105,"vikashj");
        Demo d1=new Demo(11,"rah");
        d.display();
        d1.display();

        Demo.runer();


    }
}
