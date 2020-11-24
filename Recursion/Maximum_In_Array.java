import java.io.*;
import java.util.*;

public class Maximum_In_Array {

    public static void main(String[] args) throws Exception 
    {
        // write your code here
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println(maxOfArray(arr,0));
        
    }

    public static int maxOfArray(int[] arr, int idx)
    {
        if(idx == arr.length-1)
        {
            return arr[idx];
        }
        
        int rr = maxOfArray(arr, idx + 1);
        if(rr > arr[idx])
        {
            return rr;
        }
        else
        {
            return arr[idx];
        }
    }

}