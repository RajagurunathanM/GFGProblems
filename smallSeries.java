import java.util.*;
import java.math.*;

class smallSeries
{
	static void series(int a,int n)
	{
		String sum = "";
		
		for(int i=1;i<=n;i++)
		{
			sum = sum + String.valueOf( (long)Math.pow(a,i) );
		}
		
		char[] ch = sum.toCharArray();
		
		Arrays.sort(ch);
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] != '0')
			{
				System.out.print(ch[i]);
			}
		}
		
		System.out.println();
	}
		
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
			int a = x.nextInt();
			int n = x.nextInt();
			
			series(a,n);
			
			t--;
			
		}
		
	}
}