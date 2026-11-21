public class MonthData {

    public static final int DAYS_IN_MONTH = 30;

    private int[] days = new int[DAYS_IN_MONTH];

    void setSteps(int day, int steps) {
        if (day < 1 || day > DAYS_IN_MONTH || steps < 0) {
            return;
        }
        days[day - 1] = steps;
    }

    long sumStepsFromMonth() {
        long sum = 0;
        for (int steps : days) {
            sum += steps;
        }
        return sum;
    }

    int maxSteps() {
        int max = 0;
        for (int steps : days) {
            if (steps > max) max = steps;
        }
        return max;


    }

    int bestSeries(int goal) {
        int currentSeries = 0, bestSeries = 0;
        for (int steps : days) {
            if (steps >= goal) currentSeries++;
            else currentSeries = 0;
            bestSeries = Math.max(bestSeries, currentSeries);
        }
        return bestSeries;
    }
}