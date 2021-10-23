import java.util.ArrayList;
import java.util.Scanner;
class Name
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String charList=scan.next();
        String nameList=scan.next();
        scan.close();
        String names[]=nameList.split(";");

        ArrayList<String> nlist=new ArrayList<String>();

        for(String name:names)
        {
            int count=0;
            for(int i=0;i<name.length();i++)
            {
                char letter=name.charAt(i);
                for(int j=0;j<charList.length();j++)
                {
                    if(letter==charList.charAt(j))
                    {
                        count++;
                    }
                }
            }
            if(count==name.length())
            {
                nlist.add(name);
            }
        }

        for(int i=0;i<nlist.size()-1;i++)
        {
            System.out.print(nlist.get(i)+";");
        }
        System.out.print((nlist.get(nlist.size()-1)+""+nlist.size()));
    }
}