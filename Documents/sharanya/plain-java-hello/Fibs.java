public class Fibs{
    public static void main(String[] args) {
        int n = 10; // Number of terms to print
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Series of " + n + " terms: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}