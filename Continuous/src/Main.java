public class Main {
    public static void main(String[] args) throws Exception {
        for (double i = -365; i <= 365; i += 5) {
            System.out.println(i + ": " + Continuous.getContinuous(i, 0, 360));
        }
        System.out.println("code completed.");
    }
}
