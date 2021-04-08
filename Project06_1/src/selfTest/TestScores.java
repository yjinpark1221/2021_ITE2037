package selfTest;

import java.util.Scanner;

public class TestScores {
	public static final int MAX_NUMBER_SCORES = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] scores = new double[MAX_NUMBER_SCORES];
		int counting = 0;
		
		System.out.println("This program reads test scores and shows");
		System.out.println("how much each differs from the average.");
		System.out.println("Enter test scores:");
		
		counting = fillArray(scores);
		showDifference(scores, counting);
		
	}

	public static int fillArray(double[] a)
	{
		System.out.println("Mark the end of the list with a negative number.");	
		Scanner keyboard = new Scanner(System.in);
		
		double next;
		int idx = 0;
		next = keyboard.nextDouble();
		for (; next >= 0 && idx < a.length; next = keyboard.nextDouble()) {
			a[idx] = next;
			++idx;
			
		}
		return idx;
}
	
	public static void showDifference(double a[], int numUsed)
	{
		double average = computeAverage(a, numUsed);
		
		System.out.println("Average of the scores = " + average);
		System.out.println("The scores are: ");
		
		for (int idx = 0; idx < numUsed; ++idx) {
			System.out.println(a[idx] + " differ from average by " + (a[idx] - average));
		}
	}
	
	public static double computeAverage(double a[], int numUsed)
	{	
		if (numUsed <= 0) return 0;
		double sum = 0;
		for (int idx = 0; idx < numUsed; ++idx) {
			sum += a[idx];
		}
		return sum / numUsed;
	}
}
