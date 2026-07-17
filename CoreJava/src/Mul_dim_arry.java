public class Mul_dim_arry {
    public static void main(String[] args) {

        int flats [][];
        flats = new int[2][3];
        flats [0][0]=1101;
        flats [0][1]=1102;
        flats [0][2]=1103;

        flats [1][0]=101;
        flats[1][1]=102;
        flats[1][2]=103;
        System.out.println("display 2-D arrays");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
            System.out.print(flats[i][j]);

            System.out.print("  ");
        }
            System.out.println();
        }
    }
}