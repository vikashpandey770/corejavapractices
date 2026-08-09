package CollectionsFra;

import java.util.ArrayList;

public class ArrayListString {

    public static void main(String[] args) {

        System.out.println("------------Simple example of array list in Collection program ----------");
        ArrayList<String> list=new ArrayList<>();
        list.add("vikash");
        list.add("karan");
        list.add("nimesh");
        list.add("dipesh");
        list.add("bhavesh");
        for(String sr:list)
        System.out.println(sr);
    }
}
