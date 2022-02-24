
public class Continuous {
    public static double getContinuous(double value, double low, double high) {
        double lo = min(low, high);
        double hi = max(low, high);
        double result = value;
        while(result > hi) {
            result -= (hi - lo);
        } 
        while(result < lo) {
            result += (hi - lo);
        }
        return result;
    }

    private static double min(double a, double b) {
        if (a < b) return a;
        else return b;
    }

    private static double max(double a, double b) {
        if (a > b) return a;
        else return b;
    }
}
