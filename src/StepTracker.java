import java.util.Scanner;

public class StepTracker {

    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;

    public StepTracker(Scanner scanner) {
        this.scanner = scanner;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Enter the month number (1-12): ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Please enter a month between 1 and 12.");
            return;
        }

        System.out.println("Enter the day number (1-30): ");
        int day = scanner.nextInt();
        if (day < 1 || day > 30) {
            System.out.println("Please enter a day between 1 and 30.");
            return;
        }

        System.out.println("Enter the number of steps: ");
        int numberSteps = scanner.nextInt();
        if (numberSteps < 0) {
            System.out.println("The number of steps cannot be negative.");
            return;
        }

        monthToData[month - 1].days[day - 1] = numberSteps;
        System.out.println("Steps saved successfully.");
    }

    void changeStepGoal() {
        System.out.println("Enter a new daily step goal: ");
        int newGoal = scanner.nextInt();

        if (newGoal > 0) {
            goalByStepsPerDay = newGoal;
        } else {
            System.out.println("The daily step goal must be greater than 0.");
        }

        System.out.println("Current daily step goal: " + goalByStepsPerDay);
    }
}

