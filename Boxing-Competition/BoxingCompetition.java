import java.util.ArrayList;
import java.util.Scanner;
class BoxingCompetition
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            a.add(scan.nextInt());
        }
        scan.close();
        if(n%3==0)
        {
            int prod,sum=0;
            for(int i=0;i<n;i+=3)
            {
                prod=(a.get(i)*a.get(i+1)*a.get(i+2));
                sum+=prod;
            }
            System.out.println(sum);
        }
        else
        {
            int diff=n%3,sum=0;;
            for(int i=n-1;i>=0;)
            {
                int temp=i;
                int prod=a.get(i--)*a.get(i--)*a.get(i);
                a.add(i+diff,a.get(temp));
                sum+=prod;
                if(i==0)
                {
                    break;
                }
                i+=diff;
            }
            System.out.println(sum);
        }
    }
}