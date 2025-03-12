import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double x = 10; //utworzenie zmiennej typu double i przypisanie jej wartości 10
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        System.out.println("x = " + (number) );
        System.out.println("x + x = " + (number + number) );
        System.out.println("x * x = " + (number * number) );
        }
    }