import java.io.*;
import java.util.*;

public class Zero_One_Knapsack {

   // By Recursion
   
  /* public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] prices = new int[n];
        for(int i=0; i<n; i++)
        {
            prices[i] = scn.nextInt();
        }
        int[] wts = new int[n];
        for(int i=0; i<n; i++)
        {
            wts[i] = scn.nextInt();
        }
        int cap = scn.nextInt();
        System.out.println(knapsack(prices,wts,0,cap));
    }
    
    public static int knapsack(int[] prices, int[] wts, int idx, int cap)
    {
        if(idx>=wts.length)
        {
            if(cap>=0)
            {
                return 0;
            }
            else
            {
                return Integer.MIN_VALUE;
            }
            
        }
        
        int r1= 0+knapsack(prices, wts, idx+1, cap);
        int r2= prices[idx] + knapsack(prices, wts, idx+1, cap-wts[idx]);
        return Math.max(r1,r2);
    } */
    
    // By Tabulation
    
    public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] prices = new int[n];
        for(int i=0; i<n; i++)
        {
            prices[i] = scn.nextInt();
        }
        int[] wts = new int[n];
        for(int i=0; i<n; i++)
        {
            wts[i] = scn.nextInt();
        }
        int cap = scn.nextInt();
        System.out.println(knapsack_tab(prices,wts,cap));
    }
    
    public static int knapsack_tab(int[] prices, int[] wts, int cap)
    {
        int n = prices.length+1;
        int m = cap + 1;
        int[][] dp = new int[n][m];
        
        for(int i=1; i<n; i++)
        {
            for(int j=1; j<m; j++)
            {
                int val = wts[i-1];
                int price = prices[i-1];
                if(j - val >= 0)
                {
                    dp[i][j] = Math.max(dp[i-1][j], price + dp[i-1][j-val]);
                }
                else
                {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        return dp[n-1][m-1];
    }
}