import java.io.*;
import java.util.*;

public class Get_StairPaths {

    public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(getStairPaths(n));

    }

    public static ArrayList<String> getStairPaths(int n) 
    {
        if(n < 0)
        {
            return new ArrayList<String>();
        }
        if(n == 0)
        {
            ArrayList<String> bans = new ArrayList<>();
            bans.add("");
            return bans;
        }
        
        ArrayList<String> rr1 = getStairPaths(n - 1);
        ArrayList<String> rr2 = getStairPaths(n - 2);
        ArrayList<String> rr3 = getStairPaths(n - 3);
        
        ArrayList<String> myans = new ArrayList<>();
        
        for(String s : rr1)
        {
            myans.add("1" + s);
        }
        for(String s : rr2)
        {
            myans.add("2" + s);
        }
        for(String s : rr3)
        {
            myans.add("3" + s);
        }
        return myans;
    }
        
}   