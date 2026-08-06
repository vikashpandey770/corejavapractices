package Collections;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        System.out.println("-----Array list program------");
        ArrayList<Integer> i=new ArrayList<>();
        i.add(10);
        i.add(20);
        i.add(10);
        i.add(55);

        System.out.println(i);

        for(int j=0;j<i.size();j++){
            System.out.println(i.get(j));

        }
    }
}