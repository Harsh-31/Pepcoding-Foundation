import java.io.*;
import java.util.*;

public class Power_Lograthmic {

    public static void main(String[] args) throws Exception 
    {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(power(x,n));
    }

    public static int power(int x, int n)
    {
        if(n == 0)
        {
            return 1;
        }
        int xpnb2 = power(x, n/2);
        int xpn = xpnb2 * xpnb2;
        if(n % 2 == 1) // odd
        {
            xpn = xpn * x;
        }
        return xpn;
    }

}