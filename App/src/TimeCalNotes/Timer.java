package TimeCalNotes;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Timer 
{
	long timerLength;
	
	long time = 0;
		
	Scanner scnr = new Scanner(System.in);

	long hours, minutes, seconds;
	
	public Timer(long hrs, long mins, long secs)
	{
		timerLength = TimeUnit.HOURS.toNanos(hrs) + TimeUnit.MINUTES.toNanos(mins) + TimeUnit.SECONDS.toNanos(secs);
		
		hours = hrs;
		minutes = mins;
		seconds = secs;
	}
	
	public void BeginTimer()
	{
		System.out.println("Start time: " + hours + ":" + minutes + ":" + seconds);
		
		long endLength = System.nanoTime() + timerLength;
		
		long startTime = System.nanoTime();
		
		while (System.nanoTime() <= endLength)
		{			
			if ((System.nanoTime() - startTime) % 1_000_000_000 == 0)
			{	
				time = TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime);
				
				DecrementTime(0, 0, 1);
			}
		}
		
		DecrementTime(0, 0, 1);
	}
	
	public void DecrementTime(long hrs, long mins, long secs)
	{
		seconds -= secs;
		minutes -= mins;
		hours -= hrs;
		
		if (seconds < 0) 
		{
			minutes -= 1;
			seconds = 59;
		}
		
		if (minutes < 0)
		{
			hours -= 1;
			minutes = 59;
		}
		
		System.out.println("Time left - " + hours + ":" + minutes + ":" + seconds);
		
	}
}
