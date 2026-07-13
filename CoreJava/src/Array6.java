public class Array6 {
    public static void main(String[] args) {
        int sum=0;
        int cal[]={10,54,98,98,32,01};
        for(int i=0;i<cal.length;i++){
            System.out.println(cal[i]);
            sum=sum+cal[i];
        }
        System.out.println("-----length find---------");
        System.out.println(cal.length);

        System.out.println("--------sum of length------------");
        System.out.println(sum);
    }
}
