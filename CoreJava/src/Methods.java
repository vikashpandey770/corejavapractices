public class Methods {

    static int logic(int a, int b){
        int c;
        if(a>b){
            c=a+b;
            }
        else {
            c=(a+b)*5;
        }
return c;
    }
    public static void main(String args[]){
        int a=10;
        int b=12;
        int c;
        c=logic(a,b);

        int a1=3;
        int b1=25;
        int c1;
       c1=logic(a1,b1);


       int x=10;
       int y=21;
       int z;
       z=logic(x,y);

        System.out.println("c value is:"+c);
        System.out.println("c1 value is:"+c1);

        System.out.println( "x:"+x+" "+"y:"+y);
        System.out.println("z value is: "+z);
    }
}