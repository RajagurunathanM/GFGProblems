import java.util.*;

class Binary
{
	public static void main(String args[])
	{
		int n = 100;
		String s = "";
		
		while(n>0)
		{
			int rev = n%2;
			s = s+ "" +String.valueOf(rev);
			n = n%2;
		}
		
		System.out.println(s);
	}
}