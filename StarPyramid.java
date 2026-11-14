public class prog {

    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            for (int j = i; j < rows; j++) {
                System.out.print("   ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print((i + j) + " ");
            }

   
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((i + j) + " ");
            }

            System.out.println();
        }
    }
}
