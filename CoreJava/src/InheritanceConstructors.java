class  Javas{
        Javas(){
        System.out.println("it is a very easy language");
    }
}
class Python extends Javas{
        Python(){
        System.out.println("Python is easy compare to java");
    }
}
public class InheritanceConstructors {
    public static void main(String[] args) {
         Python py=new Python();

         System.out.println();
    }
}