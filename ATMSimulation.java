import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        // Initializing the variables
        int balance = 1000, withdraw, deposit;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("ATM Simulation Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Display balance
                    System.out.println("Current Balance: " + balance);
                    System.out.println();
                    break;

                case 2:
                    // Withdraw money
                    System.out.print("Enter amount to withdraw: ");
                    withdraw = sc.nextInt();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("You withdrew " + withdraw + ". New Balance: " + balance);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    System.out.println();
                    break;

                case 3:
                    // Deposit money
                    System.out.print("Enter amount to deposit: ");
                    deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("You deposited " + deposit + ". New Balance: " + balance);
                    System.out.println();
                    break;

                case 4:
                    // Exit
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    // Invalid input
                    System.out.println("Invalid option! Please select a valid option.");
                    System.out.println();
            }
        }
    }
}
