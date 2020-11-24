import java.io.*;
import java.util.*;

public class Target_Sum_Subset {

    // By Recursion

    /*public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        System.out.println(tss(arr,0,target));
    }
    
    public static boolean tss(int[] arr, int idx, int tar)
    {
        if(idx == arr.length)
        {
            if(tar == 0)
            {
                return true;
            }
            return false;
        }
        boolean r1 = tss(arr, idx+1, tar);
        boolean r2 = tss(arr, idx+1, tar - arr[idx]);
        /*if(r1 == true || r2 == true)
        {
            return true;
        }
        else
        {
            return false;
        }*/
        
       // return r1 || r2;
    //} 
    
    //By Tabulation
    
    public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        //System.out.println(tss(arr,0,target));
        System.out.println(tsst(arr,target));
    }
    
    public static boolean tsst(int[] arr, int tar)
    {
        boolean[][] dp = new boolean[arr.length + 1][tar + 1];
        
        for(int i=0; i<dp.length; i++)
        {
            dp[i][0] =true;
        }
        
        for(int row=1; row<dp.length; row++)
        {
            for(int col=1; col<dp[0].length; col++)
            {
                if(dp[row-1][col] == true)
                {
                    dp[row][col] = true;
                }
                else
                {
                    if(col>=arr[row-1])
                    {
                        dp[row][col] = dp[row-1][col-arr[row-1]];
                    }
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}