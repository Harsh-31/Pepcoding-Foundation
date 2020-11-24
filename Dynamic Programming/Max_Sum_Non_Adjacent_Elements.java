import java.io.*;
import java.util.*;

public class Max_Sum_Non_Adjacent_Elements {

    public static void main(String[] args) throws Exception 
    {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int[] arr = new int[n];
       for(int i=0; i<n; i++)
       {
           arr[i] = scn.nextInt();
       }
       System.out.println(maxSumSubSeq(arr));

    }
    
    public static int maxSumSubSeq(int[] arr)
    {
        int n = arr.length;
        int[] include = new int[n];
        int[] exclude = new int[n];
        
        include[0] = arr[0];
        exclude[0] = 0;
        
        for(int i=1; i<n; i++)
        {
            include[i] = arr[i] + exclude[i-1];
            exclude[i] = Math.max(include[i-1],exclude[i-1]);
        }
        return Math.max(include[n-1],exclude[n-1]);
    }
}