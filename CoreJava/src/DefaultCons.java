
class Java{
    int width;
    int height;
    int depth;


    Java(){
        System.out.println("this is a java class default cons");
    }

    Java(int w, int h,int d){
        height=h;
        width=w;
        depth=d;
    }
    void print(){
        System.out.println("height: "+height);
        System.out.println("Width: "+width);
        System.out.println("depth: "+depth);
    }


    Java (Java br){
        height= br.height;
        width=br.width;
        depth=br.depth;
    }

}



public class DefaultCons {

    public static void main(String[] args) {
        Java h=new Java();

        Java j=new Java(10,15,78);
        j.print();

Java J1=new Java(j);
j.print();

    }
}
