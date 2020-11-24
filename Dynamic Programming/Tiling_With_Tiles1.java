// Tiling with 2x1 tiles

import java.io.*;
import java.util.*;

public class Tiling_With_Tiles1 {

    public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(ft(n));
    }
    
    //By Tabulation
    
   public static int ft(int n)
    {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++)
        {
            dp[i] = dp[i -1] + dp[i -2]; 
        }
        return dp[n];
    } 
    
    //By Recursion ---> By recursion one case is Time limit exceeded because by recursion that particular test case is taking too much time that's why we do this question by DP
    
    /* public static int ft(int n) 
    {
        if(n <= 0)
        {
            return n;
        }
        
        if(n == 1 || n == 2)
        {
            return n;
        }
        int a1 = ft(n - 1);
        int a2 = ft(n - 2);
        return a1 + a2;
    } */
}