public class TwoDraay {

    public static void main(String[] args) {
        int[][] ages= new int[4][4];
        ages[0][0]=89;
        ages[0][1]=10;
        ages[0][2]=45;
        ages[0][3]=55;

        ages[1][0]=10;
        ages[1][1]=20;
        ages[1][2]=30;
        ages[1][3]=40;

        ages[2][0]=90;
        ages[2][1]=80;
        ages[2][2]=70;
        ages[2][3]=60;

        ages[3][0]=01;
        ages[3][1]=02;
        ages[3][2]=03;
        ages[3][3]=04;


        for(int i=0;i< ages.length;i++){
            for(int j=0;j<ages[i].length;j++){
                System.out.print(ages[i][j]+" ");
            }
            System.out.println();
        }

    }

}
