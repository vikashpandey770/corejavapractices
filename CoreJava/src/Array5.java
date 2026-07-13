public class Array5 {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        int mark[]={10,20,22,44,58,20,56,89,35,635,98,22,35,32,98,98,2,23,78,98,65,241};

        for(i=0;i<mark.length;i++){
            System.out.println(mark[i]);

            sum = sum+mark[i];

        }
        System.out.println("total sum of arrays:"+sum);

    }
}
