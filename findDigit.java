import java.util.*;

class findDigit
{
	static int findDigits(int n) {

        ArrayList<Integer> l = new ArrayList<Integer>();

        while(n>0)
        {
            int rem = n%10;
            l.add(rem);
            n = n/10;
        }
		
        Collections.reverse(l);
		
        int result =0;
        for(int i=0;i<l.size();i++)
        {
            if(l.get(i) != 0)
            {
                if(n % l.get(i) == 0)
                {
                    result++;
                }
            }
        }

		System.out.println(result);

    }

	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		
		find(n)
	}
}