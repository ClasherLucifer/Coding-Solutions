import java.util.Scanner;
class Virus
{
    static void checkSequence(String sequence,String sample)
    {
        int sequenceLength=sequence.length()-1;
        int sampleLength=sample.length()-1;

        int i;  //Index of sample
        int j;  //Index of sequence
        i=j=0;

        while(i<sampleLength && j<sequenceLength)
        {
            if(sample.charAt(i) == sequence.charAt(j))
            {
                i++;
            }
            j++;
        }

        if(i==sampleLength) //If i matches the sample length, i.e. It is a subsequence.
            System.out.println("POSITIVE");
        else
            System.out.println("NEGATIVE");
    }

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);

        String sequence;
        int num_samples;
        String sample;

        System.out.println("Enter the sequence : ");
        sequence=scan.next();

        System.out.println("Enter the number of samples : ");
        num_samples=scan.nextInt();

        while(num_samples>0)
        {
            sample=scan.next();
            checkSequence(sequence,sample);
            num_samples--;
        }
        
        scan.close();
    }
}