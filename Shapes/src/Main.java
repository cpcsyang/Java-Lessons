public class Main {
    public static void main(String[] args) throws Exception {
        
        // Canvas canvas = Canvas.getCanvas();
        // Circle c1 = new Circle();
        // c1.makeVisible();

        // System.out.println("The end.");

        for (int speed = 0; speed <= 100; speed++) {
            String str = "";
            int strLen = 25;
            for (int i = 0; i <= 100; i += 100/strLen) {
                if (speed > i) {
                    str += "=";
                } else {
                    str += "-";
                }
            }
            str = str.substring(0, str.length() - 1);
            System.out.println( "motor[" + speed + "]:[" + str + "]");
        }

    }
    
}
