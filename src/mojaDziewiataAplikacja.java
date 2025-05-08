import java.util.Scanner;

public class mojaDziewiataAplikacja {

    static class Warehouse {
        private int number;
        private int totalSpace;
        private int occupiedSpace;
        private String owner;
        private String email;
        private String phone;

        public Warehouse(int number) {
            this.number = number;
            this.totalSpace = 5000;
            this.occupiedSpace = 0;
            this.owner = "Default Owner";
            this.email = "default@example.com";
            this.phone = "+48 000 000 000";
        }

        public void addGoods(int quantity) {
            int available = totalSpace - occupiedSpace;
            if (quantity <= available) {
                occupiedSpace += quantity;
                System.out.println("Added " + quantity + " units. Remaining warehouse space: "
                        + (totalSpace - occupiedSpace) + " units.");
            } else {
                System.out.println("Not enough space in warehouse. Available space: " + available + " units.");
            }
        }

        public void removeGoods(int quantity) {
            if (quantity <= occupiedSpace) {
                occupiedSpace -= quantity;
                System.out.println("Removed " + quantity + " units. Remaining warehouse space: "
                        + (totalSpace - occupiedSpace) + " units.");
            } else {
                System.out.println("Cannot remove " + quantity + " units — only "
                        + occupiedSpace + " units available in the warehouse.");
            }
        }

        public void checkOccupancy() {
            int free = totalSpace - occupiedSpace;
            System.out.println("Occupied space: " + occupiedSpace + " units.");
            System.out.println("Available space: " + free + " units.");
        }

        public void updateContact(String owner, String email, String phone) {
            this.owner = owner;
            this.email = email;
            this.phone = phone;
            System.out.println("Owner contact information updated:");
            System.out.println("New owner name: " + this.owner);
            System.out.println("New email: " + this.email);
            System.out.println("New phone number: " + this.phone);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Warehouse warehouse = new Warehouse(1);
        boolean running = true;

        while (running) {
            System.out.println("\n=== WAREHOUSE MENU ===");
            System.out.println("1. Add goods");
            System.out.println("2. Remove goods");
            System.out.println("3. Check occupancy");
            System.out.println("4. Update contact info");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear input

            switch (choice) {
                case 1:
                    System.out.print("Enter quantity to add: ");
                    int add = scanner.nextInt();
                    warehouse.addGoods(add);
                    break;

                case 2:
                    System.out.print("Enter quantity to remove: ");
                    int remove = scanner.nextInt();
                    warehouse.removeGoods(remove);
                    break;

                case 3:
                    warehouse.checkOccupancy();
                    break;

                case 4:
                    System.out.print("Enter new owner name: ");
                    String owner = scanner.nextLine();
                    System.out.print("Enter new email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter new phone number: ");
                    String phone = scanner.nextLine();
                    warehouse.updateContact(owner, email, phone);
                    break;

                case 5:
                    running = false;
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}

