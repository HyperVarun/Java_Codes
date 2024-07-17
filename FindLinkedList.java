/*Question : Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not.
Examples:
Input : 14->21->11->30->10, X = 14
Output : Yes
Explanation: 14 is present in the linked list.
Input : 6->21->17->30->10->8, X = 13
Output : No
* */

public class FindLinkedList {
    Node head;
    class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data=d;
            next=null;
        }

    }
    // Insert the given data in the Linked List
    public void push(int newdata)
    {
        Node newNode=new Node(newdata);
        if(head==null)
        {
            head =new Node(newdata);
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
    public void FindLL(int x)
    {
        Node current=head;
            if(current.data==x)
            {
                System.out.println("Yes");

            }
            else {
                System.out.println("No");

            }

    }
    public void DisplayLL()
    {
        Node current =head;
        while(current != null)
        {
            System.out.print(current.data +" ");
            current=current.next;
        }
    }


    public static void main(String args[])
    {
        FindLinkedList list=new FindLinkedList();
        list.push(14);
        list.push(21);
        list.push(11);
        list.push(30);
        list.push(10);

        list.DisplayLL();
        System.out.println();

       // list.FindLL(14);
        list.FindLL(7);

    }
}
