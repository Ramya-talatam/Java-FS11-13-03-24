/* 1. write a java program to find the sum of the 2nd and 3rd largest numbers in an array. int[] values = {10, 51, 53, 39, 47, 44, 21}; */

import java.util.Arrays;

public class sumOfLargest
{
  public static void main (String[]args)
  {
	int[] values = { 10, 51, 53, 39, 47, 44, 21 };
	int n = values.length;
	if (n < 3)
	  {
		System.out.println ("invalid input");

	  }
	else
	  {
		Arrays.sort (values);
		System.out.println (values[n - 2] + values[n - 3]);
	  }

  }
}
