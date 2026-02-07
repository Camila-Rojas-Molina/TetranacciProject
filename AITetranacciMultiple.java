public class AITetranacciMultiple {

    // Multiple recursive Tetranacci (exponential)
    public static long tetranacci(int n) {

        // Base cases
        if (n == 0 || n == 1 || n == 2)
            return 0;

        if (n == 3)
            return 1;

        // Recursive calls
        return tetranacci(n - 1)
             + tetranacci(n - 2)
             + tetranacci(n - 3)
             + tetranacci(n - 4);
    }

    public static void main(String[] args) {

        System.out.println("---- AI Multiple Recursive Version ----");

        for (int n = 5; n <= 200; n += 5) {

            long startTime = System.currentTimeMillis();

            long value = tetranacci(n);

            long endTime = System.currentTimeMillis();

            long elapsed = endTime - startTime;

            System.out.println("Tetranacci(" + n + ") = "
                    + value + " | Time = " + elapsed + " ms");
        }
    }
}
