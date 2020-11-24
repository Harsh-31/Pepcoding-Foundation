import java.io.*;
import java.util.*;

public class addLast
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
    }
}