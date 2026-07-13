public class Arrat8 {
    public static void main(String[] args) {
        int arr[]={10,55,48,78,63,45,02,98,21,45};

        int sum=0;
     int length= arr.length;
        System.out.println(length);

        for(int car:arr){
            sum+=car;

        }
        int avg= sum/length;
        System.out.println(avg);

         }
}
