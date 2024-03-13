/* 2. write a java program to swap two numbers without using a third variable and (+ and -) operators? int a = 200, b = 300; */


public class swap
{
  public static void main (String[]args)
  {
	int a = 200, b = 300;
	  System.out.println ("Before swapping, a = " + a + " b = " + b);
	  a = a ^ b;
	  b = a ^ b;
	  a = a ^ b;
	//xorring a number with itself is 0 so I utilised this logic
	  System.out.println ("After swapping, a = " + a + " b = " + b);

  }
}
