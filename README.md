# Java Step Tracker

A console-based Java application for tracking daily steps, setting activity goals, and viewing monthly statistics.

This project was developed as a practical exercise in Java fundamentals, including object-oriented programming, arrays, loops, conditional statements, and user input handling.

## Features

- Record the number of steps taken on a specific day.
- Track steps across 12 months, with 30 days per month.
- Set and update a daily step goal (default: 10,000 steps).
- View monthly statistics:
    - Total steps
    - Maximum daily steps
    - Average daily steps
    - Estimated distance in kilometers
    - Estimated calories burned
    - Longest consecutive streak of reaching the daily goal
- Validate month, day, step count, and daily goal values.
- Handle non-numeric input in the main menu.

## Technologies

- Java
- IntelliJ IDEA
- Git and GitHub

## Getting Started

**Requirements:** Java 21 or later.

1. Clone the repository:

   ```bash
   git clone https://github.com/shevlyagin/Java-Step-Tracker.git
   ```

2. Open the project in IntelliJ IDEA.

3. Open `src/Main.java` and run the `main()` method.

Alternatively, compile and run the application from the project root:

```bash
javac -d out src/*.java
java -cp out Main
```

## Example Output

```text
--- STEP TRACKER ---
1. Enter daily steps
2. Change daily step goal
3. Show monthly statistics
4. Exit
```

Example monthly statistics:

```text
Total steps: 28000
Maximum steps: 12000
Average daily steps: 933.3333333333334
Distance: 21 km
Calories: 1400 kcal
Best streak: 2
```

## Project Structure

```text
src/
├── Main.java
├── StepTracker.java
├── MonthData.java
└── Converter.java

docs/
└── project1.md
```

## Notes

- The application stores data in memory during execution. Data is not saved after the program exits.
- Each month contains 30 days, as specified in the original assignment.
- Distance and calorie estimates use integer calculations.
- Non-numeric input is handled in the main menu; other prompts expect numeric input.

## Original Assignment

The original project requirements are available in [docs/project1.md](docs/project1.md).