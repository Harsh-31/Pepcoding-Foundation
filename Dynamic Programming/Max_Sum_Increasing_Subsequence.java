import java.io.*;
import java.util.*;

public class Max_Sum_Increasing_Subsequence {

    public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println(msi(arr));
    }
    
    public static int msi(int[] arr)
    {
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        
        for(int i=0; i<dp.length; i++)
        {
            int max=0;
            for(int j=i-1; j>=0; j--)
            {
                if(arr[i] >= arr[j])
                {
                    max = Math.max(max,dp[j]);
                }
                
                dp[i] = max+arr[i];
            }
        }
        
        int ans=0;
        for(int i=0; i<dp.length; i++)
        {
            if(dp[i] > ans)
            {
                ans = dp[i];
            }
        }
        return ans;
    }

}