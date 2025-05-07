import java.util.Scanner;

public class mojaTrzeciaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Write a number (Write 0 or less to finish): ");
            int days = scanner.nextInt();

            if (days <= 0) {
                System.out.println("First programme ending. Now write temperature in celsius.");
                double celsius = scanner.nextDouble();
                double fahrenheit = 1.8 * celsius + 32.0;
                double kelvin = celsius + 273.16;
                System.out.printf("Fahrenheit: %.2f\n", fahrenheit);
                System.out.printf("Celsius: %.2f\n", celsius);
                System.out.printf("Kelvin: %.2f\n", kelvin);

                break;
            }

            int weeks = days / 7;
            int remainingDays = days % 7;

            if (weeks == 1) {
                System.out.println(days + " days are " + weeks + " week " + remainingDays + " days.");
            } else {
                System.out.println(days + " days are " + weeks + " weeks " + remainingDays + " days.");
            }
        }

        scanner.close();
    }
}

