package CoreJavaPracticeMix;

class Studentt{

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class GETERSETTER {
    public static void main(String[] args) {
        System.out.println("getter setter program");
        Studentt st=new Studentt();
        st.setAge(25);
        st.setName("vikash");

        System.out.println(  st.getAge());
        System.out.println( st.getName());

    }
}
