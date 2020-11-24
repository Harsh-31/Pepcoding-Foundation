import java.io.*;
import java.util.*;

public class Count_Encodings {

    public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(ec(str));

    }
    
    public static int ec(String str)
    {
        int[] dp = new int[str.length()];
        dp[0] = 1;
        
        for(int i =1; i < dp.length; i++)
        {
            // if (i-1)th character is zero and ith character is non zero then only 1 choice
            if(str.charAt(i-1) == '0' && str.charAt(i) != '0')
            {
                    dp[i] = dp[i-1];
            }
            
            else
            {
                // dp[i] = dp[i-1] + dp[i-2]
                if(str.charAt(i) != '0')
                {
                    dp[i] = dp[i-1];
                }
                
                if((Integer.parseInt(str.substring(i-1,i+1)) <= 26))
                {
                    if(i - 2 < 0)
                    {
                        dp[i] += 1;
                    }
                    else
                    {
                        dp[i] += dp[i-2];
                    }
                }
            }
        }
        return dp[dp.length - 1];
    }
}