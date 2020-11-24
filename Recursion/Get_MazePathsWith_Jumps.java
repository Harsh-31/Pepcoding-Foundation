import java.io.*;
import java.util.*;

public class Get_MazePathsWith_Jumps {

    public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(getMazePaths(0, 0, n - 1, m - 1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
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
        
        ArrayList<String> myans = new ArrayList<>();
        
        for(int jump = 1; sc + jump <= dc; jump++)  // horizontal
        {
            ArrayList<String> hr = getMazePaths(sr,sc + jump,dr,dc);
            for(String s : hr)
            {
                myans.add("h" + jump + s);
            }
        }
        
        for(int jump = 1; sr + jump <= dr; jump++)  // vertical
        {
            ArrayList<String> vr = getMazePaths(sr + jump,sc,dr,dc);
            for(String s : vr)
            {
                myans.add("v" + jump + s);
            }
        }
        
        for(int jump = 1; sc + jump <= dc && sr+jump <= dr; jump++)  // diagonal
        {
            ArrayList<String> diag = getMazePaths(sr + jump,sc + jump,dr,dc);
            for(String s : diag)
            {
                myans.add("d" + jump + s);
            }
        }
        return myans;
    }

}