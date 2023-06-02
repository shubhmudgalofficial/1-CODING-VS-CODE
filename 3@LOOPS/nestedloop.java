public class nestedloop {
    public static void main(String[] args) {
        // first pattern print
        for (int i = 0; i < 4; ++i) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        // now pattern to print a square
        // nested loop use
        int n = 10;
        for (int j = 0; j < n; ++j) {
            for (int i = 0; i < n; ++i) {
                System.out.print("*");

            }
            System.out.println();
        }
     }  //u can do some changes in theprogram if u like

}
