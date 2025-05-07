import java.util.Scanner;
public class mojaCzwartaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter lower and upper integer limits: ");
            int lower = scanner.nextInt();
            int upper = scanner.nextInt();
            if (upper <= lower) {
                System.out.println("Done");
                break;
            }
            int totalSum = 0;
            for (int i = lower; i <= upper; i = i + 1) {
                totalSum += i * i;
            }
            System.out.println("The sums of the squares from " + (lower * lower) + " to " + (upper * upper) + " is " + totalSum);
        }
        scanner.close();
    }
}