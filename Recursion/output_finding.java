class output_finding
{
    public static int fun(int n)
    {
        if(n==0)
        {
            return 1;
        }

        int myans=0;
        System.out.println(n);
        myans+=fun(n-1);
        System.out.println(n);
        myans+=fun(n-1);
        System.out.println(n);
        return myans;
    }

    public static void main(String[] args)
    {
        System.out.println(fun(3));
    }
}