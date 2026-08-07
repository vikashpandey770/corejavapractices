package CoreJavaPracticeMix;

class Manager{
    void salary(){
        System.out.println("manager salaary : 50000");
    }
}
class Emp extends Manager{
    void salary(){
        System.out.println("employe salary : 234000");
    }
}
public class EmployeOverrie {
    public static void main(String[] args) {
        System.out.println("this is a salary override");
        Emp e=new Emp();
        e.salary();
        Manager m=new Manager();
        m.salary();
    }
}