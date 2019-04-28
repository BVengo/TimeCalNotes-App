package TimeCalNotes;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main 
{
	public static long hours, minutes, seconds;

	public static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		CalculateTimerLength();
		
		Timer timer = new Timer(hours, minutes, seconds);
		
		System.out.print("Begin? (y/n)");
		
		if (scnr.next().equals("y"))
		{			
			System.out.println("Controls: STOP, PAUSE, CONTINUE");

			timer.BeginTimer();
		}
		else System.out.println("Cancelled timer");
	}
	
	public static void CalculateTimerLength()
	{
		System.out.print("Hours (0-24): ");
		hours = scnr.nextInt();
		
		System.out.print("Minutes (0-60): ");
		minutes = scnr.nextInt();
		
		System.out.print("Seconds (0-60): ");
		seconds = scnr.nextInt();
	}
}
