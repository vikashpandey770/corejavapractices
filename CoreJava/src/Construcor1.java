
class Code{
int height,width,depth;
   // this is a default constructor
    Code() {
        System.out.println("hello default");

    }

    Code(int h,int w,int d) {
        int height = h;
        int width = w;
        int depth = d;
        System.out.println("parameter construcors");
    }

    int volumn(){
     return  height * width * depth;
    }
}

public class Construcor1 {
    public static void main(String[] args) {
Code c=new Code();

Code c1=new Code(10,5,4);
  c1.volumn();
        System.out.println(c1.volumn());
    }
}
