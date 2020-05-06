import java.util.*;

class RemoveVowels
{
	static void remove(String s)
	{
		char[] ch = s.toCharArray();
		
		int i=0,j=ch.length-1;
		
		for(int z=0;z<ch.length/2;z++)
		{
			
		
		while(i<ch.length/2)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I'|| ch[i]=='O'|| ch[i]=='U')
			{
				break;
			}
			i++;
		}
		
		
		while(j>=ch.length/2)
		{
			if(ch[j]=='a' || ch[j]=='e' || ch[j]=='i' || ch[j]=='o' || ch[j]=='u' || ch[j]=='A' || ch[j]=='E' || ch[j]=='I'|| ch[j]=='O'|| ch[j]=='U')
			{
				break;
			}
			j--;
		}
		
	
		if((ch[j]=='a' || ch[j]=='e' || ch[j]=='i' || ch[j]=='o' || ch[j]=='u' || ch[j]=='A' || ch[j]=='E' || ch[j]=='I'|| ch[j]=='O'|| ch[j]=='U') && (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I'|| ch[i]=='O'|| ch[i]=='U'))	
		{
			char temp = ch[j];
			ch[j]=ch[i];
			ch[i]=temp;	
			i++;
			j--;
		}
		
		
	    }
	
		
		
		
		
		for(int y=0;y<ch.length;y++)
		{
			System.out.print(ch[y]);
		}
		
		
		
		
		
		
	}
		
	
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t=x.nextInt();
		
		while(t>0)
		{
			String s = x.next();
			
			remove(s);
			
			System.out.println();
			
			t--;
		}
	}
}
			