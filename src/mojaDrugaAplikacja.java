import java.util.Scanner;
public class mojaDrugaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your age in years:");
        double first = scanner.nextDouble();
        System.out.println("x * 31536000  = " + (first + 31536000 ));
        System.out.println("Here's your age in seconds");
    }
}