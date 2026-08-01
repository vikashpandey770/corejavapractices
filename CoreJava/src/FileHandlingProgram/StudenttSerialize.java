package FileHandlingProgram;

import java.io.*;

class  Student implements Serializable {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


public class StudenttSerialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("****************** Student System Serialization ********************");
        FileOutputStream fos=new FileOutputStream("Studentdata");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        Student s=new Student(25,"vikash pandey");
        oos.writeObject(s);
        oos.flush();
        oos.close();
        System.out.println("complete the program here");

    FileInputStream fis=new FileInputStream("Studentdata");
    ObjectInputStream ois=new ObjectInputStream(fis);
    Student s1=(Student)ois.readObject();
        System.out.println(s1);
    ois.close();
    }
}
