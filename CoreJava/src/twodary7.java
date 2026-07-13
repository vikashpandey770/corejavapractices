public class twodary7 {
    public static void main(String[] args) {

        int numbers[][]=new int[4][4];


        numbers[0][0]=10;
        numbers[0][1]=10;
        numbers[0][2]=10;
        numbers[0][3]=10;

        numbers[1][0]=20;
        numbers[1][1]=20;
        numbers[1][2]=20;
        numbers[1][3]=20;

        numbers[2][0]=30;
        numbers[2][1]=30;
        numbers[2][2]=30;
        numbers[2][3]=30;

        numbers[3][0]=40;
        numbers[3][1]=40;
        numbers[3][2]=40;
        numbers[3][3]=40;


        for(int i=0;i<numbers.length;i++){
    for(int j=0;j<numbers[i].length;j++){
        System.out.print(numbers[i][j]+"s ");
    }
    System.out.println();
}

    }
}
