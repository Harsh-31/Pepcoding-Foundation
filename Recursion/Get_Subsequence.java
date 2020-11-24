import java.io.*;
import java.util.*;

public class Get_Subsequence {

    public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(gss(str));

    }

    public static ArrayList<String> gss(String str) 
    {
        if(str.length() == 0)
        {
            ArrayList<String> bans = new ArrayList<>();  // here we can write ArrayList<String> ans as well
            bans.add("");
            return bans;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rr = gss(ros); // recursion result
        ArrayList<String> ans = new ArrayList<>();
        
        for(int i=0; i<rr.size(); i++)
        {
            String s = rr.get(i);
            ans.add(s);
        }
        
        for(int i=0; i<rr.size(); i++)
        {
            String s = rr.get(i);
            ans.add(ch + s);
        }
        
        return ans;
        
    }

}