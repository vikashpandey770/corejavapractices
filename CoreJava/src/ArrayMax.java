public class ArrayMax {
    public static void main(String[] args) {
        int[] find={50,879,3568,89535,989895,985,98635,983985,88065500};
        int max=find[0];

        for(int fin:find){
            if(fin>max){

                max=fin;

            }

            System.out.println(fin);
        }
        System.out.println("max is:"+max);


    }
}
