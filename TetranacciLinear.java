// Camila Rojas Molina et Daniel Tehrani - 40321494 40100248
// COMP 352 WINTER – Programming Assignment 1
// TetranacciLinear.java – Linear recursive with arrays

public class TetranacciLinear {
    public static long[] tetranacci(int n)
    {
        long[] A = new long[4];

        // Base cases (0, 1, 2, 3)
        if(n == 0) {
            A[0] = 0; A[1] = 0; A[2] = 0; A[3] = 1;
            return A;
        }
        else if(n == 1) {
            A[0] = 0; A[1] = 0; A[2] = 1; A[3] = 0;
            return A;
        }
        else if(n == 2) {
            A[0] = 0; A[1] = 1; A[2] = 0; A[3] = 0;
            return A;
        }
        else if(n == 3) {
            A[0] = 1; A[1] = 0; A[2] = 0; A[3] = 0;
            return A;
        }

        // Recursive case
        else {
            A = tetranacci(n-1);
            long sum = A[0] + A[1] + A[2] + A[3];
            A[0] = A[1]; A[1] = A[2]; A[2] = A[3]; A[3] = sum;
            return A;
        }
    }
     
    public static void main(String[] args) {
        System.out.println("---- Linear Recursive ----");
        for (int n = 5; n <= 200; n += 5) {
            long start = System.currentTimeMillis();
            long[] result = tetranacci(n);
            long end = System.currentTimeMillis();
            long tetranacciValue = result[3]; // The nth Tetranacci number is in A[3]
            System.out.printf("Tetranacci(%d) = %d | Time = %d ms%n", n, tetranacciValue, (end - start));
        }
    }
}