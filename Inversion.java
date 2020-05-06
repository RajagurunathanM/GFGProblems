import java.util.*;

class Inversion
{
    static void inversion(int[] a)
    {
        
        int count = 0;
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i] > a[j])
                {
                    count++;
                }
            }
        }
        
        System.out.println(count);
       
    }
    
    
    
    
    
    
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        int t = x.nextInt();
        
        while(t>0)
        {
            int n = x.nextInt();
            int[] a = new int[n];
            
            for(int i=0;i<n;i++)
            {
                a[i]=x.nextInt();
            }
             
            inversion(a);
            
                  
            t--;
        }
    
    
    }
}