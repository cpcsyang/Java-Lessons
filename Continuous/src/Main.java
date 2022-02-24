public class Main {
    public static void main(String[] args) throws Exception {
        for (double i = -3.5; i <= 3.5; i += .5) {
            System.out.println(i + ": " + Continuous.getContinuous(i, -Math.PI, Math.PI));
        }
        System.out.println("code completed.");
    }
}
