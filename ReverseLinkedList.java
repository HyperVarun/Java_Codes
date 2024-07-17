public class ReverseLinkedList {

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

//        // Iteratively Reversed LinkedLIst using Loop
//    public void revLinkedList()
//    {
//        Node current=head;
//        Node nextPtr=null;
//        Node prev=null;
//
//        while (current != null) {
//            nextPtr = current.next;
//            current.next = prev;
//            prev = current;
//            current = nextPtr;
//        }
//        head=prev;
//        return;
//    }

    // Implementation of reverse using recursion
    public void ReverseRec(Node current,Node prev)
    {
        if(current.next==null) {
            head=current;
            current.next=prev;
            return;
        }

            Node nextPtr=current.next;
            current.next=prev;
            ReverseRec(nextPtr,current);

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
            ReverseLinkedList llist=new ReverseLinkedList();
            llist.insertAtEnd(2);
            llist.insertAtEnd(4);
            llist.insertAtEnd(6);
            llist.insertAtEnd(10);

            System.out.println("Before Reverse Linked List ");
            llist.DisplayLL();
            System.out.println();
           // llist.revLinkedList();
            llist.ReverseRec(llist.head, null);
            System.out.println("After Reversal the Linked List ");
            llist.DisplayLL();

        }
    }


