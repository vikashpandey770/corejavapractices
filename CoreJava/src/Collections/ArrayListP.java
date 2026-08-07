package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListP {
    public static void main(String[] args) {
        System.out.println("************ ArrayList Program *************");

        ArrayList ar=new ArrayList();
        ar.add("vikash");
        ar.add(24);
        ar.add("pandey");
        ar.add(50.45);
        ar.add(10);
        ar.add(true);
        ar.add('t');

        System.out.println(ar);
        System.out.println(ar.get(2));
        System.out.println(ar.set(3,"vikash shrinivas pandey"));
        System.out.println(ar.getFirst());
        System.out.println(ar.getLast());

        System.out.println("-------Iterator data--------");
        Iterator itr=ar.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("---------- list Iterator program ---------");
        ListIterator litr=ar.listIterator();
        while (litr.hasNext()){
            System.out.println(litr.next()+"Tops Technology");
        }

        System.out.println("-------data privios return-------");
            while (litr.hasPrevious()){
                System.out.println(litr.previous());
            }

    }
}
