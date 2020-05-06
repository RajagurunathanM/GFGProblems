import java.util.*;

class LazyPasha
{
	static void rotate(char[] ch,int d)
	{
		int start = 0,end = ch.length-1;
		
		while(start<end)
		{
			char temp = ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
			
		}
		
		start = 0;
		end = d-1;
		
		while(start<end)
		{
			char temp = ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
			
		}
		
	    start = d;
		end = ch.length-1;
		
		while(start<end)
		{
			char temp = ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
			
		}
		
	}
		
	
	
	
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t =x.nextInt();
		
		while(t>0)
		{
			int n = x.nextInt();
			int qcount = x.nextInt();
			
			String s = x.next();
			
			char[] ch = s.toCharArray();
			
			for(int i=0;i<qcount;i++)
			{
				int q1 = x.nextInt();
				int q2 = x.nextInt();
				
				
				if(q1==1)
				{
					rotate(ch,q2);
				}
				if(q1==2)
				{
					System.out.println(ch[q2]);
				}
			}
			
			t--;
		}
	}
}
				
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			