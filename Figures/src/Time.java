
public class Time {
    public static String formatTime(long curr) {
        long mil = curr % 1000;
        long seconds = curr / 1000;
        long sec = seconds % 60;
        long  minutes = curr / 1000 / 60;
        long  min = minutes % 60;
        long  hours = curr / 1000 / 60 / 60;
        long  hrs = hours % 24;
        long  days = curr / 1000 / 60 / 60 / 24;
        long  day = days % 365;
        long  years = 1970 + curr / 1000 / 60 / 60 / 24 / 365;
        return years + "." + day + "." + hrs + ":" + min + ":" + sec + "." + mil;
    }    

    public static void printCurrentTime() {
        System.out.println(java.time.LocalDateTime.now());
    }
}
