import java.util.*;

class MinSwap
{
	public static void main(String args[])
	{
		int[] a = {1,5,4,3,2};
		int c=0;
		
		for (int i = 0; i < a.length - 1; i++)  
        {  
            int index = i; 
			
            for (int j = i + 1; j < a.length; j++)
			{  
                if (a[j] < a[index])
				{  
                    index = j;//searching for lowest index  
                }  
            }  
			
            int smallerNumber = a[index];   
            a[index] = a[i];  
            a[i] = smallerNumber;  
			
        }  
		
		System.out.println(c);
		
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
	}
}
