//  5 4 3 2 1 2 3 4 5

class Sequence
{
    public static void printseq(int n)
    {
        if(n==1)             //Base Case
        {
            System.out.println(n);
            return ;
        }

         System.out.println(n);

         printseq(n-1);  //Faith

         System.out.println(n); //Expectation
    }

    public static void main(String[] args)
    {
        printseq(5);
    }
}