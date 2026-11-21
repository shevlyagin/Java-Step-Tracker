import java.util.Scanner;

public class StepTracker {

    private static final int MONTHS_IN_YEAR = 12;

    Scanner scanner;
    Converter converter = new Converter();

    MonthData[] monthToData = new MonthData[MONTHS_IN_YEAR];
    int goalByStepsPerDay = 10000;

    public StepTracker(Scanner scanner) {
        this.scanner = scanner;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Enter the month number (1-12): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scanner.next();
            return;
        }
        int month = scanner.nextInt();
        if (!isValidMonth(month)) {
            System.out.println("Please enter a month between 1 and 12.");
            return;
        }

        System.out.println("Enter the day number (1-30): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scanner.next();
            return;
        }
        int day = scanner.nextInt();
        if (day < 1 || day > MonthData.DAYS_IN_MONTH) {
            System.out.println("Please enter a day between 1 and 30.");
            return;
        }

        System.out.println("Enter the number of steps: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scanner.next();
            return;
        }
        int numberSteps = scanner.nextInt();
        if (numberSteps < 0) {
            System.out.println("The number of steps cannot be negative.");
            return;
        }

        monthToData[month - 1].setSteps(day, numberSteps);
        System.out.println("Steps saved successfully.");
    }

    void changeStepGoal() {
        System.out.println("Enter a new daily step goal: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scanner.next();
            return;
        }
        int newGoal = scanner.nextInt();

        if (newGoal > 0) {
            goalByStepsPerDay = newGoal;
        } else {
            System.out.println("The daily step goal must be greater than 0.");
        }
        System.out.println("Current daily step goal: " + goalByStepsPerDay);
    }

    void printStatistic() {
        System.out.println("Enter the month number (1-12): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scanner.next();
            return;
        }
        int month = scanner.nextInt();

        if (!isValidMonth(month)) {
            System.out.println("Please enter a month between 1 and 12.");
            return;
        }

        MonthData monthData = monthToData[month - 1];

        long totalSteps = monthData.sumStepsFromMonth();
        System.out.println("Total steps: " + totalSteps);

        int maximumSteps = monthData.maxSteps();
        System.out.println("Maximum steps: " + maximumSteps);

        double averageStepsDay = (double) totalSteps / MonthData.DAYS_IN_MONTH;
        System.out.printf("Average daily steps: %.2f%n", averageStepsDay);

        double km = converter.convertToKm(totalSteps);
        long kilocalories = converter.convertToKilocalories(totalSteps);
        System.out.println("Distance: " + km + " km");
        System.out.println("Calories: " + kilocalories + " kcal");

        int bestStreak = monthData.bestSeries(goalByStepsPerDay);
        System.out.println("Best streak: " + bestStreak);
    }

    boolean isValidMonth(int month) {
        return month >= 1 && month <= MONTHS_IN_YEAR;
    }
}

