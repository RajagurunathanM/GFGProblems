import java.util.*;

class InterleaveString
{
	static void isInterleave(String a,String b,String c)
	{
		char[] ch = c.toCharArray();
		
		int k1 = a.length()-1;
		int flag1 =1;
		
		for(int i=0;i<ch.length-k1;i++)
		{
			String s ="";
			
			for(int j=i;j<=i+k1;j++)
			{
				s=s+ch[j];
			}
			
			if(s.equals(a))
			{
				flag1=0;
				
				for(int z=i;z<=i+k1;z++)
				{
					ch[z]='0';
				}
				
				
			}
			
		}
		
		//System.out.println(flag1);
		
		
		int k2 = b.length()-1;
		int flag2 = 1;
		
		for(int i=0;i<ch.length-k2;i++)
		{
			String s ="";
			
			for(int j=i;j<=i+k2;j++)
			{
				s=s+ch[j];
			}
			
			if(s.equals(b))
			{
				flag2=0;
				
				for(int z=i;z<=i+k2;z++)
				{
					ch[z]='0';
				}
				
				
			}
			
		}
		
		//System.out.println(flag2);
		
		if(flag1==0 && flag2==0)
		{
			System.out.println("1");           //"C is Interleave");
		}
		else
		{
			System.out.println("0");                 //"C is not Interleave");
		}
		
		
	}
		
		
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
			String a = x.next();
			String b = x.next();
			String c = x.next();
			
			isInterleave(a,b,c);
			
			t--;
		}
	}
}