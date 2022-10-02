
package contest_2020_r_4;

import java.io.*;

class GFG
{
	// Function to calculate the angle
	static int calcAngle(double h, double m)
	{
		
		int hour_angle = (int)(0.5 * (h*60 + m));
		int minute_angle = (int)(6*m);

		// Find the difference between two angles
		int angle = Math.abs(hour_angle - minute_angle);

		// smaller angle of two possible angles
		angle = Math.min(360-angle, angle);

		return angle;
	}
	
	// Driver Code
	public static void main (String[] args)
	{
		System.out.println(calcAngle(0, 16)+" degree");
		System.out.println(calcAngle(0, 49)+" degree");
	}
}

// Contributed by Pramod Kumar

