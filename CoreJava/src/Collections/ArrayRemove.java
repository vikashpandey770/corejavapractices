package Collections;

import java.util.ArrayList;

public class ArrayRemove {
    public static void main(String[] args) {
        System.out.println("******** Remove Program ********");

        ArrayList<String> news=new ArrayList<>();
        news.add("aajtak");
        news.add("9 tv");
        news.add("india tv");
        news.add("the hindu");

        System.out.println(news);
        System.out.println("Remove 1 element");
     news.remove(2);
        System.out.println(news);
    }
}
