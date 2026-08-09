package CollectionsFra;

import java.util.ArrayList;

public class ArraySet {
    public static void main(String[] args) {

        System.out.println("***** Array Set add a array using set () *****");

        ArrayList<String> setdata=new ArrayList<>();
        setdata.add("vikash");
        setdata.add("pandey");
        setdata.add("Deepak");
        setdata.add("pilor");

        System.out.println(setdata);
        System.out.println("**************************");
        setdata.set(3,"Bhavesh");
        System.out.println(setdata);

    }
}
