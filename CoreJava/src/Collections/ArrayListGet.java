package Collections;

import java.util.ArrayList;

public class ArrayListGet {
    public static void main(String[] args) {
        System.out.println("******** this program is use of array list get() ********");

        ArrayList<String> lm=new ArrayList<>();
        lm.add("vijay");
        lm.add("lala");
        lm.add("pandey");
        lm.add("vsp");
        lm.add("vikash pandey");

        for(String sr:lm){
            System.out.println(sr);
        }
        System.out.println("--------------------------------");
        System.out.println(lm.get(2));
        System.out.println(lm.get(4));
    }

}

