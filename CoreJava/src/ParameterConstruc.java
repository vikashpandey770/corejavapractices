public class ParameterConstruc {

    int age;
    String name;

    ParameterConstruc(int a, String n){
        age=a;
        name=n;
    }

    public static void main(String[] args) {
        ParameterConstruc p=new ParameterConstruc(25,"vikash");
        System.out.println( "age: "+p.age+ " name:" +p.name);
    }

}
