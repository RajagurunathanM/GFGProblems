import java.util.*;

class PhonePerm
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		while(T>0)
		{
			String str="";
			
			int N = scan.nextInt();
			int[] a= new int[N];
			
			for(int i=0;i<a.length;i++)
			{
				a[i]=scan.nextInt();
			}
			
			for(int i=0;i<N;i++)
			{
				
			switch(a[i])
			{
				case 2: char two[]={'a','b','c'};
						str=str+String.valueOf(two);
						
						break;
				case 3: char three[]={'d','e','f'};
						str=str+String.valueOf(three);
						
						break;
				case 4: char four[]={'g','h','i'};
						str=str+String.valueOf(four);
						
						break;
				case 5: char five[]={'j','k','l'};
						str=str+String.valueOf(five);
						
						break;
				case 6: char six[]={'m','n','o'};
						str=str+String.valueOf(six);
						
						break;
				case 7: char seven[]={'p','q','r','s'};
						str=str+String.valueOf(seven);
						
						break;
				case 8: char eight[]={'t','u','v'};
						str=str+String.valueOf(eight);
						
						break;
				case 9: char nine[]={'w','x','y','z'};
						str=str+String.valueOf(nine);
						
						break;
			}		
			
			}
			System.out.println(str);
			
			char[] ch = str.toCharArray();
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+3;j<ch.length;j=j+3)
				{
					for(int k=j+3;k<ch.length;k=k+3)
					{
						System.out.println(ch[i]+""+ch[j]+""+ch[k]);
					}
				}
			}
			
			T--;
		}
	}
}
