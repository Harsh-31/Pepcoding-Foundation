class Recursion_Array_Increasing
{
    public static void fun(int[]arr,int idx)
    {
        if(idx==arr.length)
        {
            return;
        }

        
        System.out.println(arr[idx]);
        fun(arr, idx+1);
    }

    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        fun(arr,0);
    }
}