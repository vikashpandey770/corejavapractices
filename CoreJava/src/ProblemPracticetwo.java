public class ProblemPracticetwo {
    public static void main(String[] args) {

        int arrays[] = {10, 5, 487, 98, 65, 55, 77, 35, 62, 02, 84, 89};
        int fin = 10;
        for (int resu : arrays) {
            System.out.println(resu);


            if (fin == resu) {
                System.out.println("yes this number is available in the array list");
            }

        }
    }
}