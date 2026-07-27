    public class VariableArgument {

  /*  static int sum(int a,int b){

        return a+b;
    }

   */
        static int sum(int ...arr){
            int sum=0;
            for(int a:arr){
                sum+=a;
            }
            return sum;
        }


        public static void main(String[] args) {
        System.out.println("Welcome to variable arguments");
        System.out.println("sum of a+b:"+sum(10,255));
            System.out.println("sum of a+b+c:"+sum(10,25,255));
            System.out.println("sum of a+b+c+d:"+sum(45,850,10,255));

            System.out.println("sum of:"+sum());


        }
}