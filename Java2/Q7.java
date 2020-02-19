// Java program to convert seconds
// into days, hours,minutes,seconds
import java.io.*;

class Q7
{
    // function convert second into day
    // hours, minutes and seconds
    static void ConvertSectoDay(int n)
    {
        int day = n / (24 * 3600);

        n = n % (24 * 3600);
        int hour = n / 3600;

        n %= 3600;
        int minutes = n / 60 ;

        n %= 60;
        int seconds = n;

        System.out.println( day + " " + "days " + hour
                + " " + "hours " + minutes + " "
                + "minutes " + seconds + " "
                + "seconds ");
    }

    // Driver code
    public static void main (String[] args)
    {
        // Given n is in seconds
        int n = 129600;
        ConvertSectoDay(n);

    }
}

// This code is contributed by vt_m.
