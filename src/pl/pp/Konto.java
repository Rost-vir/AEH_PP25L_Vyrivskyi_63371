package pl.pp;

import java.util.Scanner;

public class Konto {
    private PersonalInfo personalInfo;

    public Konto(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public double getBalance() {
        return personalInfo.getBalance();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            personalInfo.setBalance(personalInfo.getBalance() + amount);
            System.out.printf("Deposited $%.2f. New balance: $%.2f%n", amount, personalInfo.getBalance());
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= personalInfo.getBalance()) {
            personalInfo.setBalance(personalInfo.getBalance() - amount);
            System.out.printf("Withdrew $%.2f. Remaining balance: $%.2f%n", amount, personalInfo.getBalance());
        } else {
            System.out.printf("Insufficient funds. You have $%.2f in your account.%n", personalInfo.getBalance());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonalInfo userInfo = PersonalInfo.createDefaultUser();
        Konto myAccount = new Konto(userInfo);

        System.out.println("Welcome, " + userInfo.getName() + "!");

        while (true) {
            System.out.printf("%nCurrent balance: $%.2f%n", myAccount.getBalance());
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String input = scanner.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter 1, 2, or 3.");
                continue;
            }

            if (choice == 1) {
                System.out.print("Enter amount: ");
                try {
                    double amount = Double.parseDouble(scanner.nextLine());
                    myAccount.deposit(amount);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid amount.");
                }
            } else if (choice == 2) {
                System.out.print("Enter amount: ");
                try {
                    double amount = Double.parseDouble(scanner.nextLine());
                    myAccount.withdraw(amount);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid amount.");
                }
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Please enter 1, 2, or 3.");
            }
        }

        scanner.close();
    }
}
