public class Array10 {
    public static void main(String[] args) {
        int ages[]={25,45,87,98,32,85,65,78,24,32,20,5,1,6,7};

        int length= ages.length;
        System.out.println(length);

        int lowerage=ages[0];

        for(int ag:ages){
            if(lowerage>ag){
                lowerage=ag;
            }
        }
        System.out.println(lowerage);
    }
}
