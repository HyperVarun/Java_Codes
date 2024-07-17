//Q3.Given the head of a sorted linked list, delete all duplicates such that each element appears only once.Return the
//linked list sorted as well.

import java.util.Scanner;

public class PalindromeLL {
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
    public void insert(int newData)
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
    public boolean isPalindrome() {
        if (head == null || head.next == null) return true;

        // Find the middle of the linked list
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        Node prev = null, current = slow;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Compare the first half with the reversed second half
        Node firstHalf = head, secondHalf = prev;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        PalindromeLL list=new PalindromeLL();

        System.out.println("Elements inserted successful");

        System.out.println("Enter the number of elements :");
        int n=sc.nextInt();

        System.out.println("Enter the element to insert in LL :");
        for(int i=0;i<n;i++)
        {
            int data=sc.nextInt();
            list.insert(data);
        }
        boolean palindrome = list.isPalindrome();
        System.out.println("isPalindrome :"+palindrome);

    }
}
