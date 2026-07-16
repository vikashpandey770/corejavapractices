package JavaPrograms;

public class PyramidPattern {
    public static void main(String[] args) {
        int i;
        int j;
        int row = 6;

        for (i = 0; i < row; i++) {
            // Use System.out.print here so spaces stay on the same line
            for (j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}