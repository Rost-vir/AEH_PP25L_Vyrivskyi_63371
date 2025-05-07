import java.util.Scanner;
public class mojaCzwartaAplikacja_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Stop");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            if (option == 5) {
                System.out.println("Closing.");
                break;
            }

            if (option < 1 | option > 4) {
                System.out.println("Enter a number between 1 and 4.");
                continue;
            }

            System.out.print("Enter the first number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Enter a valid number.");
                scanner.next();
            }
            double number1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Error! Enter a valid number.");
                scanner.next();
            }
            double number2 = scanner.nextDouble();

            double result;
            switch (option) {
                case 1:
                    result = number1 + number2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = number1 - number2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = number1 * number2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if (number2 == 0) {
                        System.out.println("Division by zero is not allowed.");
                    } else {
                        result = number1 / number2;
                        System.out.println("Division result: " + result);
                    }
                    break;
            }
        }

        scanner.close();
    }
}
