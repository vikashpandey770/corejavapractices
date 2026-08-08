package Collections.Sort;
import java.util.ArrayList;
import java.util.Collections;
public class Collectionjs {
    public static void main(String[] args) {
        System.out.println("sorting ");
        ArrayList ar=new ArrayList();
        ar.add(45);
        ar.add(55);
        ar.add(78);
        ar.add(220);
        ar.add(34);
        System.out.println(ar);
        Collections.sort(ar);
        System.out.println(ar);
        Collections.reverseOrder();
        System.out.println("sort :"+ar);
         Collections.sort(ar,Collections.reverseOrder());
        System.out.println("reverse order :"+ar);
    }
}
