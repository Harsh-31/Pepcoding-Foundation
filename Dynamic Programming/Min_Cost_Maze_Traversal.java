import java.io.*;
import java.util.*;

public class Min_Cost_Maze_Traversal {
    // By Recursion

    /* public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println(mcp(arr,0,0));
    }
    
    public static int mcp(int[][] arr, int row, int col)
    {
        if(row==arr.length-1 && col==arr[0].length-1)
        {
            return arr[row][col];
        }
        int hc = Integer.MAX_VALUE;
        int vc = Integer.MAX_VALUE;
        if(col + 1 < arr[0].length)
        {
            hc = mcp(arr,row,col+1);
        }
        if(row + 1 < arr.length)
        {
            vc = mcp(arr,row + 1, col);
        }
        int ans = Math.min(hc,vc) + arr[row][col];
        return ans;
    } */

    // By Memoization

    /* public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        int[][] qb = new int[arr.length][arr[0].length];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                qb[i][j] = Integer.MAX_VALUE;
            }
        }
        System.out.println(mcp(arr,0,0,qb));
    }
    
    public static int mcp(int[][] arr, int row, int col, int[][] qb)
    {
        if(row==arr.length-1 && col==arr[0].length-1)
        {
            return arr[row][col];
        }
        if(qb[row][col]!= Integer.MAX_VALUE)
        {
            return qb[row][col];
        }
        
        int hc = Integer.MAX_VALUE;
        int vc = Integer.MAX_VALUE;
        if(col + 1 < arr[0].length)
        {
            hc = mcp(arr,row,col+1,qb);
        }
        if(row + 1 < arr.length)
        {
            vc = mcp(arr,row + 1, col,qb);
        }
        int ans = Math.min(hc,vc) + arr[row][col];
        qb[row][col] = ans;
        return ans;
    } */

    // By Tabulation

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int[][] qb = new int[arr.length][arr[0].length];

        System.out.println(mcpt(arr, n, m));
    }

    public static int mcpt(int[][] arr, int n, int m) {
        int[][] dp = new int[n][m];

        for (int col = m - 1; col >= 0; col--) {
            for (int row = n - 1; row >= 0; row--) {
                if (row == n - 1 && col == m - 1) {
                    dp[n - 1][m - 1] = arr[n - 1][m - 1]; // arr[n-1][m-1] ki value dp[n-1][m-1] mei store karwadi. Here we are storing smaller problem
                } else if (col == m - 1) {
                    dp[row][col] = arr[row][col] + dp[row + 1][col];
                } else if (row == n - 1) {
                    dp[row][col] = arr[row][col] + dp[row][col + 1];
                } else {
                    dp[row][col] = arr[row][col] + Math.min(dp[row][col + 1], dp[row + 1][col]);
                }
            }
        }
        return dp[0][0];
    }

}