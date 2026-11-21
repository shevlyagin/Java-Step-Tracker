public class MonthData {
    private int[] days = new int[30];

    void setSteps(int day, int steps) {
        if (day < 1 || day > 30 || steps < 0) {
            return;
        }
        days[day - 1] = steps;
    }

    int sumStepsFromMonth() {
        int sum = 0;
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