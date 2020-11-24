import java.io.*;
import java.util.*;

public class Longest_Palindromic_Substring
{

    public static void main(String[] args) throws Exception
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(lpss(str));
 
    }
    
    public static int lpss(String str)
    {
        boolean[][] dp = new boolean[str.length()][str.length()];
        
        int ans = 0;
        for(int dg = 0; dg < dp.length; dg++)
        {
            int sp = 0;
            int ep = dg;
            while(ep < dp.length)
            {
                if(dg == 0)
                {
                    dp[sp][ep] = true;
                } 
                else if(dg == 1)
                {
                    if(str.charAt(sp) == str.charAt(ep))
                    {
                        dp[sp][ep] = true;
                    }
                    else
                    {
                        dp[sp][ep] = false;
                    }
                }
                else
                {
                    if(str.charAt(sp) == str.charAt(ep))
                    {
                        dp[sp][ep] = dp[sp + 1][ep - 1];
                    }
                    else
                    {
                        dp[sp][ep] = false;
                    }
                }
                if(dp[sp][ep] == true)
                {
                    int npl = dg + 1;
                    ans = Math.max(ans,npl);
                }
                sp++;
                ep++;
            }
            
        }
        return ans;
    }
}