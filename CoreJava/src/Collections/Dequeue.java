package Collections;

import java.util.ArrayDeque;

public class Dequeue {
    public static void main(String[] args) {
        System.out.println("------------------");

        ArrayDeque ad=new ArrayDeque();
        ad.offer(23);
        ad.offer(21);
        ad.offer(42);
        ad.offer(543);

        ad.addFirst(1234);
        ad.addLast("viakshj pandey");
        System.out.println(ad);
        System.out.println("first element: "+ad.peek());
        System.out.println("last element :"+ad.pollLast());
        System.out.println(ad.poll());
        System.out.println(ad.isEmpty());
        System.out.println(ad.pop());
        System.out.println(ad);
    }
}
