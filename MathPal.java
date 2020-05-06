import java.util.*;

class MathPal
{
	static void check(int n)
	{
		int pal = 0;
		
		for(int i=0;i<5;i++)
		{
			String s1 = String.valueOf(n);
			
			StringBuffer sb = new StringBuffer(s1);
			sb.reverse();
			
			String s2 = String.valueOf(sb);		
			
			if(s1.equals(s2))
			{
				//pal = Integer.valueOf(s1);
				System.out.println(s1);
				return;
			}
			
			
			int n2 = Integer.valueOf(s2);
			
			int temp = n + n2;
			
			//System.out.println(temp);
			
			String s3 =  String.valueOf(temp);
			
			StringBuffer sb2 = new StringBuffer(s3);
			sb2.reverse();
			
			String s4 = String.valueOf(sb2);
			
			if(s3.equals(s4))
			{
				//pal = Integer.valueOf(s3);
				System.out.println(s3);
				return;
			}
			
			n = temp;
		}
			
		//System.out.println(pal);	
			
		//}
		
	}		
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t > 0)
		{
			int n = x.nextInt();
			
			check(n);
			
			t--;
		}
		
	}
}
		