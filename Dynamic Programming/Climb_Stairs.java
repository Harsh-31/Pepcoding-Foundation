import java.io.*;
import java.util.*;

public class Climb_Stairs {


 // By Memoization
 
   /*  public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] qb = new int[n+1];   // making of DP
        System.out.println(cs(n,qb));
    }
    
    public static int cs(int n, int[] qb)
    {
        if(n==0)
        {
            return 1;
        }
        
        if(n<0)
        {
            return 0;
        }
        
        if(qb[n]!=0)
        {
            return qb[n];
        }
        
        int c1 = cs(n-1, qb);
        int c2 = cs(n-2, qb);
        int c3 = cs(n-3, qb);
        int fc = c1 + c2 + c3;
        qb[n] = fc;
        return fc;
    } */
    
    // By Tabulation
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] qb = new int[n+1];   // making of DP
        System.out.println(cs(n));
    }
    
    
    public static int cs(int n)
    {
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i=1; i<dp.length; i++)
        {
            dp[i] = dp[i-1];
            if(i-2>=0)
            {
                dp[i]+=dp[i-2];
            }
            
            if(i-3>=0)
            {
                dp[i]+=dp[i-3];
            }
        }
        return dp[n];
    }

}