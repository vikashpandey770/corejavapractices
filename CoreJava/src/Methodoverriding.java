
class University{

    void student(){

        System.out.println("all student");
    }
}
class Socca extends University{
    void student(){

        super.student();

        System.out.println("all student is bca or mca branch");
    }
}
class Doctors extends Socca{

    void student(){
        super.student();
        System.out.println("all student is medical department");
    }
}
public class Methodoverriding {
    public static void main(String[] args) {

        Doctors d=new Doctors();
        d.student();
    }
}