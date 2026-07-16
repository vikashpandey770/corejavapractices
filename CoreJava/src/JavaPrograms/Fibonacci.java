package JavaPrograms;

public class Fibonacci {
    public static void main(String[] args) {
int a=0;
int b=1;
int c;
int i;
int count=10;

        for(i=1;i<=count;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);

        }
    }
}