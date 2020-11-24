import java.io.*;
import java.util.*;

public class Get_NokiaKeyPad {

    public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(getKPC(str));
    }
    
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKPC(String str) 
    {
        if(str.length() == 0)        //Base Case
        {
            ArrayList<String> bans = new ArrayList<>();
            bans.add("");
            return bans;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rr = getKPC(ros);
        ArrayList<String> myans = new ArrayList<>();
        
       String code = codes[Integer.parseInt(ch + "")]; // we can write it as --> codes[ch - '0']
       for(int i = 0; i < code.length(); i++)
       {
           char choice = code.charAt(i);
           for(String s : rr)
           {
               myans.add(choice + s);
           }
       }
       return myans;
    }
}