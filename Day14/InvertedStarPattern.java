package Day14;

class InvertedStarPattern {
    public static void main(String[] args) {

        // * * * * * * * * * *
        // * * * * * * * * *
        // * * * * * * * *
        // * * * * * * *
        // * * * * * *
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        int n = 10;
        // outer Loop
        for (int line = 1; line <= n; line++) {

            // inner Loop
            for (int star = 1; star <= n - line + 1; star++) {
                // what to print
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}