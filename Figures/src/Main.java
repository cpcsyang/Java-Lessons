 

public class Main {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; i++) {
            long t = System.currentTimeMillis();
            Time.printCurrentTime();
            System.out.println(t);
            System.out.println(Time.formatTime(t));
        }

        Canvas canvas = Canvas.getCanvas();
        Circle c1 = new Circle();
        c1.makeVisible();
        c1.moveLeft();
        c1.slowMoveHorizontal(200);
    
        canvas.wait(2000);

        Time.printCurrentTime();
        long curr = System.currentTimeMillis();
        System.out.println("The end.  " + curr);
        System.out.println("The end.  " + Time.formatTime(curr));

    }
    
}
