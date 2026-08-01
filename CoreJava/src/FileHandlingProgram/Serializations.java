package FileHandlingProgram;

import java.io.*;

class  Employee implements Serializable{

    int age;
    double salary;
    String name;
    int Idno;
    public Employee(int age, int idno, String name, double salary) {
        this.age = age;
        Idno = idno;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", Idno=" + Idno +
                '}';
    }
}


public class Serializations {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("********* this is a serialization program and store in txt file **********");
        FileOutputStream fos=new FileOutputStream("Empdata");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        Employee e= new Employee(25,25000,"vikash",525417);

        oos.writeObject(e);
        oos.flush();
        oos.close();
        System.out.println("ok close your program here");

        FileInputStream fis=new FileInputStream("Empdata");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Employee e1=(Employee)ois.readObject();
        System.out.println(e1);
        ois.close();



    }
}
