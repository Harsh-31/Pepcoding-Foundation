import java.io.*;
import java.util.*;

public class Arrange_Buildings{

// By tabulation

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(abt(n));
 }

public static long abt(int n)
{
    long[] eAts = new long[n+1];
    long[] eAtb = new long[n+1];
    eAts[1] = eAtb[1] = 1;
    for(int i=2; i<=n; i++)
    {
        eAts[i] = eAts[i-1] + eAtb[i-1];
        eAtb[i] = eAts[i-1];
    }
    long ans = eAts[n] + eAtb[n];
    return ans * ans;
}

}