import java.io.*;
import java.util.*;

public class Print_MazePathsWith_Jumps {

    public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePaths(0, 0, n - 1, m - 1, "");
        System.out.println();  // this enter will handle if user gives input 0,0
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String asf) 
    {
        if(sr == dr && sc == dc)
        {
            System.out.println(asf);
            return;
        }
        
        
        for(int jump = 1; sc + jump <= dc; jump++)  // horizontal
        {
            printMazePaths(sr,sc + jump,dr,dc,asf + "h" + jump);
        }
        
        for(int jump = 1; sr + jump <= dr; jump++)  // vertical
        {
            printMazePaths(sr + jump,sc,dr,dc,asf + "v" + jump);
        }
        
        for(int jump = 1; sc + jump <= dc && sr+jump <= dr; jump++)  // diagonal
        {
            printMazePaths(sr + jump,sc + jump,dr,dc,asf + "d" + jump);
        }
    }

}