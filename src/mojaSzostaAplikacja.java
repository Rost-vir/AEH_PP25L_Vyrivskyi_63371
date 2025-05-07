import java.util.Scanner;
public class mojaSzostaAplikacja {
    public static int factorialIterative(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
        return result;
    }
    public static int factorialRecursive(int x) {
        if (x <= 1) {
            return 1;
        } else {
            return x * factorialRecursive(x - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number x to calculate x! ");
        int x = scanner.nextInt();
        if (x < 0) {
            System.out.println("No");
            return;
        }
        long startIterative = System.nanoTime();
        long resultIterative = factorialIterative(x);
        long endIterative = System.nanoTime();
        long timeIterative = endIterative - startIterative;
        long startRecursive = System.nanoTime();
        long resultRecursive = factorialRecursive(x);
        long endRecursive = System.nanoTime();
        long timeRecursive = endRecursive - startRecursive;
        System.out.println("Factorial (" + x + ") - iterative: " + resultIterative);
        System.out.println("Execution time (iterative): " + timeIterative + " ns");
        System.out.println("Factorial (" + x + ") - recursive: " + resultRecursive);
        System.out.println("Execution time (recursive): " + timeRecursive + " ns");
    }
}