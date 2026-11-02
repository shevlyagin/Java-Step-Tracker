public class Converter {
    int convertToKm(int steps) {
        return (steps * 75) / 100000;
    }

    int convertToKilocalories(int steps) {
        return (steps * 50) / 1000;
    }
}
