public class Array9 {
    public static void main(String[] args) {
        int age[] = {25, 50, 20, 45, 5, 65, 98, 32};
        int length = age.length;
        System.out.println(length);

        int lowerage=age[0];
        for(int ages:age){
            if(lowerage>ages){
                lowerage=ages;
            }
        }
        System.out.println("lowest age:"+lowerage);
    }
}