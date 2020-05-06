import java.util.*;

class PalinArray
{
	
	 static boolean palindrome(int n)
    {
        String s = String.valueOf(n);
        StringBuffer sb = new StringBuffer(s);
        
        if( (sb.reverse()).equals(sb) )
        {
			System.out.println(sb.reverse());
            return true;
        }
        
        return false;
    }
    
    
	static int palinArray(int[] a, int n)
    {
             for(int i=0;i<n;i++)
            {
                if(palindrome(a[i]) )
                {
                    continue;
                }
                else
                {
                     return 0;
                }
            }
                 
            return 1;
			
    }
	
	
	
	
	
	
	
	
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		
		int n = 5;
		int[] a = new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i] = x.nextInt();
		}
		
		int result = palinArray(a,5);
		
		System.out.println(result);
	}
}