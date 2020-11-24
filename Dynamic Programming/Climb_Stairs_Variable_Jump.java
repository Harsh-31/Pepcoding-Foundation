import java.io.*;
import java.util.*;

public class Climb_Stairs_Variable_Jump 
{

    // By Recursion
   /* public static void main(String[] args) throws Exception 
    {
        Scanner scn =  new Scanner(System.in);
        int n =  scn.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println(cpj(arr,0));
    }
    
    public static int cpj(int[] arr, int src)
    {
        if(src==arr.length-1)
        {
            return 1;
        }
        if(src>=arr.length)
        {
            return 0;
        }
        
        int ans=0;
        for(int jump=1; jump<=arr[src]; jump++)
        {
            ans+= cpj(arr, src+jump);
        }
        return ans;
    } */
    
    //By Memoization
    
    /* public static void main(String[] args) throws Exception 
    {
        Scanner scn =  new Scanner(System.in);
        int n =  scn.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }
        int[] qb =  new int[n];
        System.out.println(cpj(arr,0,qb));
    }
    
    public static int cpj(int[] arr, int src, int[] qb)
    {
        if(src==arr.length-1)
        {
            return 1;
        }
        if(src>=arr.length)
        {
            return 0;
        }
        
        if(qb[src]!=0)
        {
            return qb[src];
        }
        
        int ans=0;
        for(int jump=1; jump<=arr[src]; jump++)
        {
            ans+= cpj(arr, src+jump, qb);
        }
        
        qb[src] = ans;
        return ans;
    } */
    
    // By Tabulation
    
    public static void main(String[] args) throws Exception 
    {
        Scanner scn =  new Scanner(System.in);
        int n =  scn.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println(cpj(arr));
    }
    
    public static int cpj(int[] arr)
    {
        int n =  arr.length;
        int[] dp = new int[n];
        dp[n-1] = 1;
        for(int i=n-2; i>=0; i--)
        {
            for(int jump=1; jump<=arr[i]; jump++)
            {
                if(i+jump < n)
                {
                    dp[i] += dp[i+jump];
                }
            }
            
        }
        
        return dp[0];
    }
    
}