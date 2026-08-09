package CollectionsFra;

import java.util.ArrayList;

public class ArrayListSize {
    public static void main(String[] args) {
        System.out.println("-----------------Find the Size----------------");

        ArrayList<String> vsp=new ArrayList<>();
        vsp.add("hello");
        vsp.add("java");
        vsp.add("World");

        for(String vp:vsp){
            System.out.println(vp);
        }
        System.out.print("size of array: ");
        System.out.println(vsp.size());

    }
}
