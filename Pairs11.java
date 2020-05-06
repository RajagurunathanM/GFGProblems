import java.lang.*;
import java.io.*;

class  Pairs11
{
    static void find(ArrayList<Integer> a,ArrayList<Integer> b,int k)
    {
		Collections.sort(a);
		
        StringBuffer sb = new StringBuffer() ;
        
        for(int i=0;i<a.size();i++)
        {
            int diff = k - a.get(i);
			
			if(b.contains(diff))
			{
				sb.append(a.get(i));
                sb.append(" ");
                sb.append(diff);
                sb.append(", ");
			}
			
        }
        
        if(sb.length() == 0)
        {
            System.out.println(-1);
            return;
        }
        
        sb.delete(sb.length()-2 , sb.length()-1);
        
        System.out.println(sb);
        
    }
    
	public static void main (String[] args) {
		
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		
		while(t > 0)
		{
		    int n1 = x.nextInt();
		    int n2 = x.nextInt();
		    int k = x.nextInt();
		    
		    ArrayList<Integer> a = new ArrayList<Integer>();
		    ArrayList<Integer> b = new ArrayList<Integer>();
		    
		    for(int i=0;i<n1;i++)
		    {
		        a.add(x.nextInt());
		    }
		    
		    for(int i=0;i<n2;i++)
		    {
		        b.add(x.nextInt());
		    }
		    
		    find(a,b,k);
		    
		    t--;
		    
		}
		
		
	}
}