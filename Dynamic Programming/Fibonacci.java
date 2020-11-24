import java.io.*;
import java.util.*;

public class Fibonacci{

/*public static void main(String[] args) throws Exception 
 {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(fibo(n));
 }
 
// By Recursion
public static int fibo(int n)
{
    if(n == 0 || n == 1)
    {
        return n;
    }
    
    int res1 = fibo(n-1);
    int res2 = fibo(n-2);
    int sum = res1 + res2;
    
    return sum;
} */
 
// By Memoization

/* public static void main(String[] args) throws Exception 
 {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] dp = new int[n+1];
    System.out.println(fibo(n,dp));
 }
 
public static int fibo(int n, int[] dp)
{
    if(n == 1 || n == 0)
    {
        return n;
    }
    
    if(dp[n] != 0)
    {
        return dp[n];
    }
    
    int nm1 = fibo(n - 1, dp);
    int nm2 = fibo(n - 2, dp);
    dp[n] = nm1 + nm2;
    return dp[n];
} */

// By Tabulation

public static void main(String[] args) throws Exception 
{
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(fibo(n));
}

public static int fibo(int n)
{
    int[] dp = new int[n + 1];   //creation of dp
    
    dp[0] = 0;   // write smaller problem first
    dp[1] = 1;   // write smaller problem first
    
    for(int i=2; i<=n; i++)
    {
        int nm1 = dp[i-1];
        int nm2 = dp[i-2];
        dp[i] = nm1 + nm2;
    }
    
    return dp[n];   //because the answer will store in the last box of the dp's array.
}

}