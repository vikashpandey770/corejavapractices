package CoreJavaPracticeMix;

class depak{
    int salary=1000;

}
class pilor extends depak{
int age=2;

}

public class Inheritance1 {
    public static void main(String[] args) {

        pilor p=new pilor();
        int age = p.age;
      int salary= p.salary;
        System.out.println(age);
        System.out.println(salary);

    }
}
