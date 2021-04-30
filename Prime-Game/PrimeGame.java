import java.util.Scanner;

class PrimeGame
{
    static int primeDiff(int lower,int upper)
    {

        int minPrime=0;
        int maxPrime=0;

        int count;

        //This loop finds the SMALLEST Prime number in the given range
        for(int i=lower;i<=upper;i++)
        {
            count=0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==1)
            {
                minPrime=i;
                break;
            }
        }

        //This loop finds the GREATEST Prime number in the given range
        for(int i=upper;i>=lower;i--)
        {
            count=0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==1)
            {
                maxPrime=i;
                break;
            }
        }
        
        if(maxPrime==0 && minPrime==0)
        {
            return -1;
        }
        else
        {
            return maxPrime-minPrime;
        }
    }

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the number of test cases : ");
        int test_cases=scan.nextInt();

        while(test_cases>0)
        {
            int lower=scan.nextInt();
            int upper=scan.nextInt();

            System.out.println(primeDiff(lower,upper));

            test_cases--;
        }
        scan.close();
    }

}