//Q4. Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

import java.util.Scanner;

public class RemoveDuplicateLL {

        Node head;
        class Node
        {
            int data;
            Node next;

            Node(int data)
            {
                this.data=data;
                this.next=null;
            }

        }
        public void Insert(int newData)
        {
            Node newNode=new Node(newData);
            if(head==null)
            {
                head=new Node(newData);
                return;
            }
            newNode.next=null;
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
        public void removeDuplicate()
        {
            if (head == null) return;
            Node current = head;
            while (current != null && current.next != null)
            {
                if (current.data == current.next.data)
                {
                    current.next = current.next.next;
                }
                else
                {
                    current = current.next;
                }
            }
        }
        public void DisplayLL()
        {
            Node current =head;
            while(current!=null)
            {
                System.out.print(current.data + " ");
                current=current.next;
            }
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            RemoveDuplicateLL list=new RemoveDuplicateLL();

            System.out.println("Enter the number of elements :");
            int n=sc.nextInt();

            System.out.println("Enter the element to insert in LL :");
            for(int i=0;i<n;i++)
            {
                int data=sc.nextInt();
                list.Insert(data);
            }
            System.out.print("Before remove the duplicate elements :");
            list.DisplayLL();

            list.removeDuplicate();
            System.out.print("\n After removed the duplicate elements :");
            list.DisplayLL();

        }
}
