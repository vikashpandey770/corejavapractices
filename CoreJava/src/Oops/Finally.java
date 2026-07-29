package Oops;

public class Finally {
    public static void main(String[] args) {
        System.out.println("-----------this is a finally keyword---------------");
        try {
            int a=34;
            int b=5;
            int c=a/b;
            System.out.println(c);
        }
        finally {
            System.out.println("finally executed");

        }

    }
}

