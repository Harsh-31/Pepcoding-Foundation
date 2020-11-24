class RecursionArrayDecreasing
{
    public static void fun(int[]arr,int idx)
    {
        if(idx==arr.length)
        {
            return;
        }

        fun(arr, idx+1);
        System.out.println(arr[idx]);
    }

    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        fun(arr,0);
    }
}