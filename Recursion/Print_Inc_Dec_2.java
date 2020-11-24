//5 4 3 2 1 1 2 3 4 5
import java.io.*;
import java.util.*;

public class Print_Inc_Dec_2 {

    public static void main(String[] args) throws Exception 
    {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdi(n);
    }

    public static void pdi(int n)
    {
        if(n == 1)
        {
            System.out.println(n);
            return;
        }
        
        System.out.println(n);
        pdi(n - 1);
        System.out.println(n);
    }

}