import java.io.*;
import java.util.*;

public class Count_Binary_Strings{
    
    // By tabulation

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(cbst(n));
 }

public static int cbst(int n)
{
    int[] eAt0 = new int[n+1];
    int[] eAt1 = new int[n+1];
    eAt0[1] = eAt1[1] = 1;
    for(int i=2; i<=n; i++)
    {
        eAt0[i] = eAt1[i-1];
        eAt1[i] = eAt0[i-1] + eAt1[i-1];
    }
    int ans = eAt0[n] + eAt1[n];
    return ans;
}
}