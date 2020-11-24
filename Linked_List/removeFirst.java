import java.io.*;
import java.util.*;

public class removeFirst
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

      public int size()
      {
          return size;
      }

      
    public void removeFirst()
    {
      if(size == 0)
      {
          System.out.println("List is empty");
      }
      else if(size == 1)
      {
          this.head = null;
          this.tail = null;
          this.size--;
      }
      else
      {
          this.head = this.head.next;
          this.size--;
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
        System.out.println("Before removing the size of list is: " + list.size());
        list.removeFirst();
        list.display();
        System.out.println();
        System.out.println("After removing the size of list is: " + list.size());
    }
}