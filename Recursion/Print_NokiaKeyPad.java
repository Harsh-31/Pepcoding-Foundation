import java.io.*;
import java.util.*;

public class Print_NokiaKeyPad
{

    public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printKPC(str, "");

    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printKPC(String ques, String asf)
    {
        if(ques.length() == 0)
        {
            System.out.println(asf);
            return;
        }
        
        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        String code = codes[ch - '0'];
        for(int i = 0; i < code.length(); i++)
        {
            char choice = code.charAt(i);
            printKPC(roq,asf + choice);
        }
    }
}