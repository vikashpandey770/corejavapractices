class Teacher{
    void emp(String name,double salary){
        System.out.println("your name is: "+name+  "\nyour salary is :"+salary);
    }
    void emp(int age,int salary){
        System.out.println("your age is: "+age+ " \nyour salary is:"+salary);
    }
    void emp(int a){
        System.out.println("your age is :"+a);
        if(a>18){
            System.out.println("you are eligible for vote");
        }
        else {
            System.out.println("not eligible for vote next time try again");
        }
    }
}
public class Methodoverloadiung {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.emp("vikash",25500);
        t.emp(45,15200);
        t.emp(77);
    }
}