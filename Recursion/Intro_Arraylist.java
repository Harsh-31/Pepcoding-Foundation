import java.util.*;
class Arraylist
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        //===================================Taking Input in ArrayList from User==============================
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            al.add(scn.nextInt());
        }
        System.out.print(al + " ");
        System.out.println();
        //===================================================================================================

        /*ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        System.out.println(al); //We can print arraylist by just using the name of arraylist or we can use for loop as well

        System.out.println();
        al.remove(3);
        System.out.print(al);
        System.out.println();

        System.out.println(al.get(2));
        System.out.println();
        al.set(2,100); //set value 100 at index 2
        System.out.print(al);
        System.out.println();
        System.out.println(al.size()); //print the size of arraylist

        //Other way of printing arraylist is using for loop
        for(int i = 0; i < al.size(); i++)
        {
            System.out.println(al.get(i));
        }

        //Another way of printing arraylist is using for-each loop 
        for(int a : al)
        {
            System.out.print(a + " ");
        }
        System.out.println();

        al.add(3, 100); //It will print 100 at index 3

        ArrayList<String> als = new ArrayList<>();
        als.add("hi");
        als.add("bye");
        //print the arraylist of string using for each loop
        for(String s : als)
        {
            System.out.println(s);
        } */
    } 
}