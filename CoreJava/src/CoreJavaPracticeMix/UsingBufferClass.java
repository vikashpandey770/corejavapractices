package CoreJavaPracticeMix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingBufferClass {
    public static void main(String[] args) throws IOException {
        System.out.println("-------using the Buffer reader class program-------");

        BufferedReader r=new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println("enter a value: ");

        String s= r.readLine();
        System.out.println(s);
    }
}

