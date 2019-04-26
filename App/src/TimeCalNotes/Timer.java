package TimeCalNotes;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Timer 
{
	long timerLength;
	long endTime;
	long hoursInNano, minsInNano, secsInNano;
		
	Scanner scnr = new Scanner(System.in);
	
	public Timer(int length)
	{
		timerLength = TimeUnit.SECONDS.toNanos(length);
	}
	
	public void BeginTimer()
	{
		
		long endLength = System.nanoTime() + timerLength;
		
		long startTime = System.nanoTime();
		
		while (System.nanoTime() < endLength);
		
		endTime = TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime);
		
		System.out.println("End Time: " + endTime);
	}
}
