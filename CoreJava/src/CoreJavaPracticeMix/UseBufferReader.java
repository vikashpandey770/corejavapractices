package CoreJavaPracticeMix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseBufferReader {
    public static void main(String[] args) throws IOException {
        System.out.println("-------------using the buffer reader program------------");

        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter an Integer: ");
        int number=Integer.parseInt(reader.readLine());
        System.out.println("your entered: "+number);
    }
}
