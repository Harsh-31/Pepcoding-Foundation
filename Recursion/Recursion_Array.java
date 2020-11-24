class Recursion_Array
{
    public static int data_first_occ(int[] arr, int idx, int val)
    {
        if(idx==arr.length)
        {
            return -1;
        }

        int myans= data_first_occ(arr, idx+1, val);   //faith
        if(arr[idx]==val)
        {
            return idx;
        }

        return myans;
    }

    //===============================================================================

    public static int data_last_occ(int[] arr, int idx, int val)
    {
        if(idx==arr.length)
        {
            return -1;
        }

        int ans= data_last_occ(arr, idx+1, val);   // here we can't write i++
        if(ans==-1 && arr[idx]==val)
        {
            return idx;                     
        }
        return ans;
    }

    //===============================================================================

    public static int[] all_occ(int[] arr, int idx, int data, int count)
    {
        if(idx==arr.length)
        {
            int[] ans= new int[count];
            return ans;
        }

        if(ans[idx]==data)
        {
            count++;
        }

        int[] arr= all_occ(arr, idx+1, data, count);
        if(arr[idx]==data)
        {
            ans[count-1]=idx;
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int[] arr= {2,3,2,1,0,1,2,4,7};
        //System.out.println(data_first_occ(arr,0,1));
        //System.out.println(data_last_occ(arr,0,1));
        int[] ans= all_occ(arr,0,2,0);
        for(int i=0; i<ans.length; i++)
        {
            System.out.println(ans[i]);
        }
    }
}