public class MiddleLinkedList {
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
    // insert the node at the very end in the linked list
    public void insertAtEnd(int newdata)
    {
        // initialize the newNode with the newData entered by the user
        Node newNode= new Node(newdata);

        //LinkedList is empty
        if(head==null)
        {
            head =new Node(newdata);
            return;
        }
        //LinkedList is not empty
        newNode.next=null;
        //traversing the linked-list at the end of the node
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        return;
    }

    // Find a middle node of the  LinkedLIst
    public void middleNode(){
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("The  Middle Node of the Linked List is : "+slow.data);
    }
    // Implementation of printing Linked List
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
        MiddleLinkedList llist=new MiddleLinkedList();
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(6);
        llist.insertAtEnd(9);
        llist.insertAtEnd(10);

        System.out.println("Before Reverse Linked List ");
        llist.DisplayLL();
        System.out.println();
        llist.middleNode();

    }
}
