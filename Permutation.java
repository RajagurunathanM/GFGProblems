import java.util.*;

class Permutation
{
	static void perm(String s)
	{
		
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		
		int i=0;
		
		while(i<ch.length)
		{
		
		ArrayList l = new ArrayList();
		
		for(int j=0;j<ch.length;j++)
		{
			if(ch[i]!=ch[j])
			{
				l.add(ch[j]);
			}
		}
		
		for(int r =0;r<l.size();r++)
		{

		
		System.out.print(ch[i]);
		
		for(int k=0;k<l.size();k++)
		{
			System.out.print(l.get(k));
		}
		System.out.print(" ");	
		rotate(l);

		}
		
		i++;
		}
			
			
			
	}
	
	
	
	static void rotate(ArrayList l)
	{
		Object temp = l.get(0);
		
		for(int i=0;i<l.size()-1;i++)
		{
			l.set(i,l.get(i+1));
		}
		
		l.set(l.size()-1,temp);
	}
	
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t>0)
		{
			String s = x.next();
			
			perm(s);
			
			System.out.println();
			
			t--;
		}
	}
}