public class twodary6 {
    public static void main(String[] args) {

        int numbers[][]=new int[2][3];
        numbers[0][0]=10;
        numbers[0][1]=20;
        numbers[0][2]=30;

        numbers[1][0]=20;
        numbers[1][1]=40;
        numbers[1][2]=60;
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}