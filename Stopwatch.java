import java.util.*;

public class Stopwatch
{
    static double start = 0, stop = 0;

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 to start:-");
        s.next();
        startTime();

        System.out.println("Enter to stop");
        s.next();
        stopTime();
        elapsedTime();
    }
    static void startTime()
    {
        start = System.currentTimeMillis();
        System.out.println("Started at " + start);
    }
    static void stopTime()
    {
        stop = System.currentTimeMillis();
        System.out.println("Stopped at " + stop);
    }

    static void elapsedTime()
    {
        System.out.println("Elapsed time is " + (stop - start) / 1000);
    }

}
