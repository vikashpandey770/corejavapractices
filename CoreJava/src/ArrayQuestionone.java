
public class ArrayQuestionone {
    public static void main(String[] args) {

        float arry[] = {55, 25, 45.50f, 87.4f, 65, 11, 21.9f};
        float sum = 0;
        int i;

        for (i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
            sum =sum+arry[i];

        }
        System.out.println("total length of array: " + arry.length);
        System.out.println("total sum of array: "+sum);
    }
}
