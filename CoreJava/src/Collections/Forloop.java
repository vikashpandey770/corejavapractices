package Collections;

import java.util.ArrayList;

public class Forloop {
    public static void main(String[] args) {
        System.out.println("********---------  using for loop  --------*********");

        ArrayList<Integer> iam=new ArrayList<>();
        iam.add(10);
        iam.add(58);
        iam.add(87);
        iam.add(20);
        iam.add(10);
        iam.add(89);

        for(int i=0;i<iam.size();i++){
            System.out.println(iam.get(i));
        }

        iam.isEmpty();
        System.out.println(iam);

        iam.clear();
        System.out.println(iam);

    }
}
