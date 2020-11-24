import java.io.*;
import java.util.*;

public class Print_MazePaths {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePaths(0, 0, n - 1, m - 1, "");
        System.out.println();  // this enter is for controlling the case of 0,0 input
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String asf) {
        if (sr == dr && sc == dc) 
        {
            System.out.println(asf);
            return;
        }
        
        if(sc + 1 <= dc)
        {
        printMazePaths(sr, sc + 1, dr, dc, asf + "h");
        }
        
        if(sr + 1 <= dr)
        {
        printMazePaths(sr + 1, sc, dr, dc, asf + "v");
        }

    }

}