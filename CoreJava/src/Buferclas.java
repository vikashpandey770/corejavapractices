public class Buferclas {
    public static void main(String[] args) {
        System.out.println("This is a buffer class");

        long startTime=System.currentTimeMillis();
        StringBuffer sb=new StringBuffer("tops");
        for(int i=1;i<=100000000;i++){
            sb.append("nikol");
        }
        System.out.println("Time take by String buffer:"+(System.currentTimeMillis()-startTime)+"ms");

        startTime =System.currentTimeMillis();
        StringBuilder sbul=new StringBuilder("tops");
        for(int i=1;i<100000000;i++) {
            sbul.append("nikols");
        }
        System.out.println("Time take by String builder "+(System.currentTimeMillis()-startTime)+"ms");
    }
}