import java.io.*;
import java.util.*;

public class Get_MazePaths {

    public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(getMazePaths(0, 0, n - 1, m - 1));

    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) 
    {  
        if(sr > dr || sc > dc)
        {
            return new ArrayList<String>();
        }
        if(sr == dr && sc == dc)
        {
            ArrayList<String> bans = new ArrayList<>();
            bans.add("");
            return bans;
        }
        
        ArrayList<String> hpaths = getMazePaths(sr, sc + 1, dr, dc);
        ArrayList<String> vpaths = getMazePaths(sr + 1, sc, dr, dc);
        
        ArrayList<String> allPaths = new ArrayList<>();
        for(String s : hpaths)
        {
            allPaths.add('h' + s);
        }
        
        for(String s : vpaths)
        {
            allPaths.add('v' + s);
        }
        return allPaths;
    }

}