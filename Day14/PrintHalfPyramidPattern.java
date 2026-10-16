package Day14;

public class PrintHalfPyramidPattern {

    // 1
    // 12
    // 123
    // 1234

    public static void main(String[] args) {

        int n = 4;
        // Outer Loop
        for (int line = 1; line <= n; line++) {
            System.out.println();
            // Inner loop
            for (int num = 1; num <= line; num++) {
                System.out.print(num + " ");
            }

        }
    }
}
