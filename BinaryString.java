import java.util.*;

class BinaryString
{
	static void binary(String s)
	{
		char[] ch = s.toCharArray();
		int count=0;
		
		int k=1;
		while(k<ch.length)
		{
			
		
		for(int i=0;i<ch.length-k;i++)
		{
			if(ch[i]=='1' && ch[i+k]=='1')
			{
				count++;
			}
			
			
		}
		
		k++;
		
		}
		
		System.out.println(count);
	}
	
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t= x.nextInt();
		
		while(t>0)
		{
			int n = x.nextInt();
			
			String s = x.next();
			
			binary(s);
			
			t--;
		}
	}
}