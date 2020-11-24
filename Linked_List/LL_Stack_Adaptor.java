import java.io.*;
import java.util.*;

public class LL_Stack_Adaptor {

  public static class LLToStackAdapter {
    LinkedList<Integer> l1;

    public LLToStackAdapter() {
      l1 = new LinkedList<>();
    }


    int size()
    {
      return l1.size();
    }

    void push(int val) 
    {
      l1.addFirst(val);
    }

    int pop() 
    {
        if(l1.size() == 0)
        {
            System.out.println("Stack underflow");
            return -1;
        }
        else
        {
            return l1.removeFirst();
        }
    }

    int top() 
    {
        if(l1.size() == 0)
        {
            System.out.println("Stack underflow");
            return -1;
        }
        else
        {
            return l1.getFirst();
        }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LLToStackAdapter st = new LLToStackAdapter();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("push")){
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if(str.startsWith("pop")){
        int val = st.pop();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("top")){
        int val = st.top();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(st.size());
      }
      str = br.readLine();
    }
  }
}