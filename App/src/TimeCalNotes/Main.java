package TimeCalNotes;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main 
{
	public static long timerLength;
	public static long hoursInSecs, minsInSecs, secs;

	public static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		CalculateTimerLength();
		
		Timer timer = new Timer(timerLength);
		
		System.out.print("Begin? (y/n)");
		
		if (scnr.next().equals("y"))
		{			
			System.out.println("Controls: STOP, PAUSE, CONTINUE");

			System.out.println("Start time: 0");

			timer.BeginTimer();
		}
		else System.out.println("Cancelled timer");
	}
	
	public static void CalculateTimerLength()
	{
		System.out.print("Hours (0-24): ");
		hoursInSecs = (int) TimeUnit.HOURS.toSeconds(scnr.nextInt());
		
		System.out.print("Minutes (0-60): ");
		minsInSecs = (int) TimeUnit.MINUTES.toSeconds(scnr.nextInt());
		
		System.out.print("Seconds (0-60): ");
		secs = scnr.nextInt();
		
		timerLength = hoursInSecs + minsInSecs + secs;
	}
}
