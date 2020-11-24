class Factorial_Rec
{
    public static int fact(int n)
    {   if(n==1)
        {
            return 1 ;
        }

        int nm1fact= fact(n-1);
        int myfact= n*nm1fact;
        return myfact;
    }

    public static void main(String[] args)
    {
        int n=fact(5);
        System.out.println(n);
    }
}