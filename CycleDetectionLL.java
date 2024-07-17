public class CycleDetectionLL {

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
    public void insertAtBegin(int newdata)
    {
        CycleDetectionLL.Node newNode= new CycleDetectionLL.Node(newdata);
        newNode.next=head;
        head=newNode;
    }

    // insert the node at any location in the linked list

    public void insertAtany(int newdata, Node prevNode)
    {
        if(prevNode==null)
        {
            System.out.println("The previous node cannot contains null values");
            return;
        }
        CycleDetectionLL.Node newNode=new CycleDetectionLL.Node(newdata);
        newNode.next=prevNode.next;
        prevNode.next=newNode;

    }

        //Floyd's Cycle Detection Algorithm
        //Implementation of detecting the loop inside the linked list
    public void detectLoop(){
            Node slow=head,fast=head;
            slow=slow.next;
            fast=fast.next.next;
            int flag=0;
            while(slow!=null && fast!=null && fast.next!=null)
            {
                if(slow==fast)
                {
                    flag=1;
                    break;
                }

            }
            if(flag==0)
                System.out.println("No loop Detected");
            else
                System.out.println("Loop is Detected");
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
            CycleDetectionLL llist=new CycleDetectionLL();
            llist.insertAtEnd(2);
            llist.insertAtEnd(4);
            llist.insertAtEnd(6);
            llist.insertAtEnd(9);
            llist.insertAtEnd(10);

            System.out.println("Before insertion of 12");
            llist.DisplayLL();

            llist.insertAtBegin(1);
            System.out.println();
            llist.insertAtany(7,llist.head.next.next);
            System.out.println("After insertion of 12");
            llist.DisplayLL();
            System.out.println();

            Node temp= llist.head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next= llist.head;
            llist.detectLoop();
        }


}
