public class twodarray3 {
    public static void main(String[] args) {
        int sum=0;

        int numbers[]={10,54,87,98,65,24,65};
        for(int add:numbers){
            System.out.println(add);
        }
        for(int i=0; i<numbers.length;i++){
            System.out.println(i);
            sum+=numbers[i];
        }
        int lowernumber=numbers[0];
        if(lowernumber>numbers.length){
            lowernumber=numbers.length;
            System.out.println("lower number in array:"+lowernumber);
        }

        System.out.println("total sum of value: "+sum);

        int length=numbers.length;
        System.out.println("length of:"+length);


        int per=sum/length;

        System.out.println("average value:"+per);



        }
    }

