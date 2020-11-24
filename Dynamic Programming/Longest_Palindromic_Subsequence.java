import java.io.*;
import java.util.*;

public class Longest_Palindromic_Subsequence {

    public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(lpss(str));
    }
    
    public static int lpss(String str)
    {
        int[][] dp = new int[str.length()][str.length()];
        
        for(int gap = 0; gap < dp.length; gap++)
        {
            int sp = 0;
            int ep = gap;
            while(ep < dp.length)
            {
                if(gap == 0)
                {
                    dp[sp][ep] = 1;
                }
                
                else if(gap == 1)
                {
                   if(str.charAt(sp) == str.charAt(ep))
                   {
                       dp[sp][ep] = 2;
                   }
                   else
                   {
                       dp[sp][ep] = 1;
                   }
                }
                
                else
                {
                    if(str.charAt(sp) == str.charAt(ep))
                    {
                        dp[sp][ep] = dp[sp + 1][ep - 1] + 2;
                    }
                    else
                    {
                        dp[sp][ep] = Math.max(dp[sp + 1][ep],dp[sp][ep -1]);
                    }
                }
                sp++;
                ep++;
            }
        }
        return dp[0][dp.length - 1];
    }
}