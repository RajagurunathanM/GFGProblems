import java.util.*;

class SortFreq
{
	static void frequency(int[] a,int n)
	{
		HashMap<Integer,Integer> hp = new HashMap<Integer,Integer>();
		
		for(int i=0;i<n;i++)
		{
			if( !(hp.containsKey(a[i])) )
			{
				hp.put(a[i],1);
			}
			else
			{
				hp.put(a[i],hp.get(a[i])+1);
			}
		}
		
		//System.out.println(hp);
		
		ArrayList<Integer> element = new ArrayList<Integer>();
		ArrayList<Integer> freq = new ArrayList<Integer>();
		
		Set s = hp.entrySet();
		Iterator itr = s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry m = (Map.Entry)itr.next();
			
			element.add((Integer) m.getKey());
			freq.add((Integer) m.getValue());
			
		}
		
		//System.out.println(element);
		//System.out.println(freq);
		
		for(int i=0;i<freq.size();i++)
		{
			for(int j=i+1;j<freq.size();j++)
			{
				if(freq.get(i) < freq.get(j))
				{
					Collections.swap(freq,i,j);
					Collections.swap(element,i,j);
				}
				else
				{
					if(freq.get(i) == freq.get(j) && element.get(i) > element.get(j))
					{
						Collections.swap(freq,i,j);
						Collections.swap(element,i,j);
					}
				}
						
			}
		}
		
		//System.out.println("......."+element);
		//System.out.println("......."+freq);
		
		for(int i=0;i<element.size();i++)
		{
			for(int j=0;j<freq.get(i);j++)
			{
				System.out.print(element.get(i)+" ");
			}
		}
		
	}
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t > 0)
		{
			int n = x.nextInt();
			
			int[] a = new int[n];
			
			for(int i=0;i<n;i++)
			{
				a[i] = x.nextInt();
			}
			
			frequency(a,n);
			
			t--;
			
		}
		
	}
}


