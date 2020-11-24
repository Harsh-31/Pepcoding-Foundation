import java.io.*;
import java.util.*;

public class Print_Subsequence {

    public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printSS(str,"");
        System.out.println();

    }

    public static void printSS(String ques, String asf) // asf ----> answer so far
    {
        if(ques.length() == 0)
        {
            if(asf.length() != 0)
            {
            System.out.println(asf);
            }
            return;
        }
        
        char ch = ques.charAt(0);
        String roq = ques.substring(1);  // roq -----> rest of the question
        printSS(roq,asf + "");
        printSS(roq,asf + ch);
        
    }

}