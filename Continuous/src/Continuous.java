
public class Continuous {
    /**
     * @param value The value that is to be converted 
     * @param low The low-value that is designated to be identical to high-value
     * @param high The high-value that is designated to be identical to low-value
     * @return The equivalent of the value passed in
     * Examples: 
     * getContinuous(365, 0, 360) returns 5
     * getContinuous(-350, 0, 360) returns 10
     */
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

    /**
     * Return of the lower 
     * @param a
     * @param b
     * @return the lower of the 2 parameters passed in
     */
    private static double min(double a, double b) {
        if (a < b) return a;
        else return b;
    }

    /**
     * Returns the higher
     * @param a
     * @param b
     * @return the higher of the 2 parametes passed in
     */
    private static double max(double a, double b) {
        if (a > b) return a;
        else return b;
    }
}
