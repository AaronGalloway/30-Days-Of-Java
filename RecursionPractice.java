public class RecursionPractice {
    
    // Compilation of functions example: f(f(f(a)))
    //f(a) = 5 + a
    //f(20) = 5 + 20 = 25
    //f(f(f(20))) = f(f(25))
    //f(25) = 5 + 25 = 30
    //f(f(25)) = f(30)
    //f(30) = 30 + 5 = 35
    //end state is 35

    // Summation example: 5 + 4 + 3 + 2 + 1
    // Summation example: 3 + 2 + 1

    public static int Summation(int n) {
        // Base Case: We are at the end
        if (n <= 0) {
            return 0; // additive identity property
        } 
        // Recursive Case: Keep going
        else {
            // Example using the number 3 as a start
            // Step 1: 3 + Summation(2) | Recursive
            // Step 2: 3 + 2 + Summation(1) | Recursive
            // Step 3: 3 + 2 + 1 + Summation(0) | Recursive
            // Step 4: 3 + 2 + 1 + 0 | Base
            return n + Summation(n-1);
        }
    }

    // Example Factorial: 5!
    // 5 * 4 * 3 * 2 * 1 
    public static int Factorial(int n) {
        // Base Case:
        if (n <= 1) {
            return 1; // multiplicative identity
        }
        // Recurisve Case
        else {
            // Example using 5 as a start
            // Step 1: 5 * Factorial(4) | Recursive
            // Step 2: 5 * 4 * Factorial(3) | Recursive
            // Step 3: 5 * 4 * 3 * Factorial(2) | Recursive
            // Step 4: 5 * 4 * 3 * 2 * Factorial(1) | Recursive
            // Step 5: 5 * 4 * 3 * 2 * 1 | Base
            return n * Factorial(n-1);
        }
    }

    // Example Exponential Case: 5^3
    // % * 5 * 5
    public static int Exponentiation(int n, int p) {
        // Base Case:
        if (p <= 0) {
            return 1; // multiplicative identity
        }
        // Recursive Case
        else {
            // Example using (5, 5) to start
            // Step 1: 5 * Exponentiation(5, 4) | Recursive
            // Step 2: 5 * 5 * Exponentiation(5, 3) | Recursive
            // Step 3: 5 * 5 * 5 * Exponentiation(5, 2) | Recursive
            // Step 4: 5 * 5 * 5 * 5 * Exponentiation(5, 1) | Recursive
            // Step 5: 5 * 5 * 5 * 5 * 5 * Exponentiation(5, 0) | Recursive
            // Step 6: 5 * 5 * 5 * 5 * 5 * 1 | Base
            return n * Exponentiation(n, p-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Summation " + Summation(5));
        System.out.println("Factorial " + Factorial(5));
        System.out.println("Exponential " + Exponentiation(5, 5));
    }
}
