public class Try_CatchMulti {

    public static void main(String[] args) {
        System.out.println("-------------this is use of try block one and catch block multiple---------------");
        try {
            int[] men = {10, 5, 8, 98, 05, 24};
            System.out.println(men[4]);
            int result = 10 / 0;
        }
        catch (ArithmeticException e){
            System.out.println("arithmetic error:"+e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array error:"+e);
        }
        catch (Exception e){
            System.out.println("exception error:"+e);
        }
    }
}
