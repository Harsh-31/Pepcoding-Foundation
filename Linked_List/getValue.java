import java.io.*;
import java.util.*;

public class getValue
{
    public static class Node
    {
        int data;
        Node next;
    }

    public static class LinkedList
    {
        Node head;
        Node tail;
        int size;

      public void addLast(int val)
      {
        //create a new node
        Node n = new Node();

        //set the value of node
        n.data = val;

        //set the next of node
        if(this.size == 0)
        {
            this.head = n;
            this.tail = n;
        }
        else
        {
            this.tail.next = n;
            this.tail = n;
        }
        this.size++;
      }

      public int getFirst()
    {
      if(size == 0)
      {
        System.out.println("List is empty");
        return -1;
      } 
      else
      {
        return head.data;
      }
    }

    public int getLast()
    {
      if(size == 0)
      {
        System.out.println("List is empty");
        return -1;
      } else 
      {
        return tail.data;
      }
    }

    public int getAt(int idx)
    {
      if(idx < 0 || idx >= size)
      {
          System.out.println("Invalid arguments");
          return -1;
      }
      
      if(size == 0)
      {
          System.out.println("List is empty");
          return -1;
      }
      
      if(idx == 0)
      {
          return getFirst();
      }
      else if(idx == size - 1)
      {
          return getLast();
      }
      else
      {
          Node temp = head;
          for(int i = 0; i < idx; i++)
          {
              temp = temp.next;
          }
          return temp.data;
      }
    }

      public void display()
      {
          if(size == 0)
          {
             return;
          }
          else
          {
             Node temp = this.head;
             while(temp != null)
             {
               System.out.print(temp.data + "->");
               temp = temp.next;
             }
          }
        }
    }

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.display();
        System.out.println();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.getAt(2));
    }
}