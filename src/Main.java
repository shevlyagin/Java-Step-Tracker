
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StepTracker steptracker = new StepTracker(scanner);

        while (true) {
            printMenu();

            System.out.print("\nEnter a command: ");
            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    System.out.println("\nEnter daily steps");
                    steptracker.addNewNumberStepsPerDay();
                    break;

                case 2:
                    System.out.println("\nChange daily step goal");
                    break;

                case 3:
                    System.out.println("\nShow monthly statistics");
                    break;

                case 4:
                    System.out.println("\nExiting application...");
                    return;

                default:
                    System.out.println("\nInvalid command. Please try again.");
            }
        }
    }

    static void printMenu() {
        System.out.println("\n--- STEP TRACKER ---");
        System.out.println("1. Enter daily steps");
        System.out.println("2. Change daily step goal");
        System.out.println("3. Show monthly statistics");
        System.out.println("4. Exit");
    }
}