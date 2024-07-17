public class LinkedList {
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

    // insert the node at the very beginning in the linked list
    public void inssertAtBegin(int newdata)
    {
        Node newNode= new Node(newdata);
        newNode.next=head;
        head=newNode;
    }
    // insert the node at the any location in the linked list

    public void insertAtany(int newdata,Node prevNode)
    {
        if(prevNode==null)
        {
            System.out.println("The previous node cannot contains null values");
            return;
        }
        Node newNode=new Node(newdata);
        newNode.next=prevNode.next;
        prevNode.next=newNode;

    }

    // Implementation of Deletion in the LinkedList
    public void deleteNode(int position)
    {
        //First check LinkedList is empty
        if(head==null)
        {
            return;
        }
        Node temp=head;
        //deletion at the beginning of the linked list
        if(position==0)
        {
            head=temp.next;
            return;
        }
        //deletion at the any node of the linked list
        for(int i=0; temp!=null && i<position-1;i++){
            temp=temp.next;
        }

        if(temp==null && temp.next==null)
        {
            return;
        }
        temp.next=temp.next.next;

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
        LinkedList llist=new LinkedList();
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(6);
        llist.insertAtEnd(10);

        System.out.println("Before insertion of 12");
        llist.DisplayLL();

        llist.insertAtEnd(12);
        llist.inssertAtBegin(1);
        System.out.println();
        llist.insertAtany(11,llist.head.next.next);
        System.out.println("After insertion of 12");
        llist.DisplayLL();
        System.out.println();

        //llist.deleteNode(3);
        llist.deleteNode(0);
        llist.DisplayLL();
        System.out.println();
    }
}
