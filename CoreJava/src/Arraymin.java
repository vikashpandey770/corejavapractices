import static java.util.Collections.min;

public class Arraymin {
    public static void main(String[] args) {


    int[] find={10,54,898,35,83568,99,01,658,89,5,893,8};
int min=find[0];

        for(int finder:find){
        System.out.println(finder);
if(finder<min){
    min=finder;
}

    }
        System.out.println("min is:"+min);
    }

}
