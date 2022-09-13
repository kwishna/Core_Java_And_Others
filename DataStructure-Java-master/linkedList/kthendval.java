import java.util.*;
class kthendval
{

    static Node head;
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        head=null;
        if(n>0)
        {
            head=new Node(sc.nextInt());
            Node temp=head;
            for(int i=1;i<n;i++)
            {
                temp.next=new Node(sc.nextInt());
                temp=temp.next;
            }

        }
        int k=sc.nextInt();
        kthfromend(k,n);
        lastNthNode(k);  //another approach
        //show();     
    }

    static void lastNthNode(int n) {
 
        Node ptr1=head;
        int counter=0;
        while(counter<n)
        {
            ptr1=ptr1.next;
            counter++;
        }
        Node ptr2=head;
        while(ptr1!=null)
        {
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        System.out.println(ptr2.data);
   
   
       }

    static void kthfromend(int k,int n)
    {

        Node temp=head;
        // int c=0;
        // while(temp!=null)
        // {
        //     c++;
        //     temp=temp.next;
        // }
        if(k>n)
        {
            System.out.println("Not Possible");
        }
        else
        {
            n=n-k;
            for(int i=0;i<n;i++)
            {
                temp=temp.next;
            }
             System.out.println(temp.data);

        }
        


    }

    static void show()
    {
        if(head==null)
        {

        }
        else
        {
            Node temp=head;

            while(temp.next!=null)
            {
                 System.out.print(temp.data+" ");
                temp = temp.next;
            }
             System.out.println(temp.data);

        
        }
    }



}