import java.io.*;
import java.util.*;

public class Print_Encodings {

    public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printEncodings(str,"");
        System.out.println();
    }

    public static void printEncodings(String ques, String asf) 
    {
        if(ques.length() == 0)
        {
            System.out.println(asf);
            return;
        }
        if(ques.charAt(0) == '0')
        {
            return;
        }
        String ch0 = ques.charAt(0) + "";
        String roq0 = ques.substring(1);
        
        printEncodings(roq0,asf + (char)(Integer.parseInt(ch0) -1 + 'a'));
        
        if(ques.length() > 1)
        {
            String ch1 = ques.substring(0,2);
            String roq1 = ques.substring(2);
            if(Integer.parseInt(ch1) <= 26)
            {
                printEncodings(roq1,asf + (char)(Integer.parseInt(ch1) - 1 + 'a'));
            }
        }
        
    }

}