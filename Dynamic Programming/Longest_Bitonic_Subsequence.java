import java.io.*;
import java.util.*;

public class Longest_Bitonic_Subsequence {

   public static void main(String[] args) throws Exception 
    {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println(lbs(arr));
    }
    
    public static int lbs(int[] arr)
    {
        int[] dp1 = new int[arr.length];
        dp1[0] = 1;
        
        for(int i = 1; i < dp1.length; i++)
        {
            int max = 0;
            for(int j = i-1; j >= 0; j--)
            {
                if(arr[i] > arr[j])
                {
                    max = Math.max(max,dp1[j]);
                }
            }
            dp1[i] = max + 1;
        }
        
        int[] dp2 = new int[arr.length];
        dp2[dp2.length-1] = 1;
        
        for(int i = dp2.length - 2; i >= 0; i--)
        {
            int max = 0;
            for(int j = i+1; j < dp2.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    max = Math.max(max,dp2[j]);
                }
            }
            dp2[i] = max + 1;
        }
        
        int ans =0;
        for(int i = 0; i < arr.length; i++)
        {
            ans = Math.max(ans, dp1[i] + dp2[i] - 1);
        }
    
        return ans;
    }
}