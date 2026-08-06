package CoreJavaPracticeMix;

public class UsingCommandLineArgument {
    public static void main(String[] args) {
        System.out.println("****using command line argument program ****");
        if(args.length>0) {
            System.out.println("command line argument is:");
            for (String val : args)
                System.out.println(val);
            }
            else{
                System.out.println("no  command line argument found.");

        }
    }
}
