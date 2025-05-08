import java.util.Arrays;
import java.util.Scanner;

public class mojaDziesiataAplikacja {

    public static int[] countAndSumElements(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int negativeCount = 0;
        int positiveSum = 0;

        for (int num : input) {
            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {
                positiveSum += num;
            }
        }

        return new int[] {negativeCount, positiveSum};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers separated by spaces:");
        String inputLine = scanner.nextLine();
        scanner.close();

        if (inputLine.trim().isEmpty()) {
            System.out.println("Empty input. Result: []");
            return;
        }

        String[] tokens = inputLine.trim().split("\\s+");
        int[] numbers = new int[tokens.length];

        try {
            for (int i = 0; i < tokens.length; i++) {
                numbers[i] = Integer.parseInt(tokens[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter only integers.");
            return;
        }

        int[] result = countAndSumElements(numbers);

        if (result.length == 0) {
            System.out.println("Input array is null or empty.");
        } else {
            System.out.println("Number of negative elements: " + result[0]);
            System.out.println("Sum of positive elements: " + result[1]);
        }

        System.out.println("Result as array: " + Arrays.toString(result));
    }
}
