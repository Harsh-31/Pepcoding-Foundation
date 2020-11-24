import java.io.*;
import java.util.*;

public class addFirst
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

      public void addFirst(int val)
      {
        if(size == 0)
        {
            Node temp = new Node();
            this.head = temp;
            this.tail = temp;
            temp.data = val;
            temp.next = null;
            this.size++;
        }
        else
        {
            Node temp = new Node();
            temp.data = val;
            temp.next = this.head;
            this.head = temp;
            this.size++;
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
        System.out.println("Before adding the size of list is: " + list.size());
        list.addFirst(50);
        list.display();
        System.out.println();
        System.out.println("After adding the size of list is: " + list.size());
    }
}