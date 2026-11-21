public class Converter {
    double convertToKm(long steps) {
        return (steps * 75.0) / 100000;
    }

    long convertToKilocalories(long steps) {
        return (steps * 50) / 1000;
    }
}
