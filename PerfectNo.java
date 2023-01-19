import java.util.Scanner;

public class PerfectNo
{
    public static void main(String[] args) 
    {
        int n, sum = 0;
		
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number:-");
        n = s.nextInt();
		
        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }
		
        if(sum == n)
        {
            System.out.println("Number is PerfectNo.");
        }
        else
        {
            System.out.println("Number is not PerfectNo.");
        }    
    }
    int divisor(int x)
    {
       return x;
    }
}