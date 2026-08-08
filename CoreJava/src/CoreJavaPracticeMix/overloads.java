package CoreJavaPracticeMix;

class Furniture{
    void wood(){
        System.out.println("this is a wood");
    }
    String wood(String name){
        System.out.println(name);
        return name;

    }

}

public class overloads {
    public static void main(String[] args) {
        System.out.println("overloading");

        Furniture f=new Furniture();
        f.wood();
        f.wood("java wooden");
    }
}
