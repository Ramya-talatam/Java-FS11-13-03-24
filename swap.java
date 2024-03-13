/* 2. write a java program to swap two numbers without using a third variable and (+ and -) operators? int a = 200, b = 300; */

import java.util.*;
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
	  System.out.println ("After swapping using xor, a = " + a + " b = " + b);
	  
	 //re-declaring original values
	 a=200;b=300;
	 List l = new ArrayList<Integer>(2);
	 l.add(a);
	 l.add(b);
	 Collections.swap(l,0,1);
	 System.out.println ("After swapping using inbuit swap, "+l);
  }
}
