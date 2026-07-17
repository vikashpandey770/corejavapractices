public class ProblemPracThree {

    public static void main(String[] args) {
        int arr[]={45,78,98,65,74,77,52,20,33,45,68,26,98,35,98,26,35,94,};
        int sum=0;
int avg=0;
        for(int vs:arr){
            System.out.println(vs);
            sum=sum+vs;
             avg=sum/arr.length;

        }
        System.out.println("length of array: "+arr.length);
        System.out.println("sum of arrays: "+sum);
        System.out.println("total average of sum: "+avg);
    }
}