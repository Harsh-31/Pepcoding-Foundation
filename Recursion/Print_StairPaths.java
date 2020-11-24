import java.io.*;
import java.util.*;

public class Print_StairPaths 
{

    public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printStairPaths(n,"");
    }
    

    // ques---> distance away from destination
    
    public static void printStairPaths(int n, String asf) 
    {
        if(n < 0)
        {
            return;
        }
        if(n == 0)
        {
            System.out.println(asf);
            return;
        }
        printStairPaths(n - 1,asf + "1");
        printStairPaths(n - 2,asf + "2");
        printStairPaths(n - 3,asf + "3");
    }

}