import java.io.*;
import java.util.*;

public class Longest_Increasing_Subsequence {

    public static void main(String[] args) throws Exception 
    {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println(lis(arr));
    }
    
    public static int lis(int[] arr)
    {
        int[] dp = new int[arr.length];
        dp[0] = 1;
        
        for(int i = 1; i < dp.length; i++)
        {
            int max = 0;
            for(int j = i-1; j >= 0; j--)
            {
                if(arr[i] > arr[j])
                {
                    max = Math.max(max,dp[j]);
                }
            }
            dp[i] = max + 1;
        }
        
        int ans =0;
        for(int i = 0; i < dp.length; i++)
        {
            if(dp[i] > ans)
            {
                ans = dp[i];
            }
        }
        return ans;
    }

}