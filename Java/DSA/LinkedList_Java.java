package DSA;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data =  data;
    }
}

class LinkedList{

    Node head = null;

    public void add(int data){
        Node newNode = new Node(data);

        Node current = head;

        if(head == null)
            head = newNode;
        else{
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void delete(int data){
        Node current = head;
        // if(head == null){
        //     System.out.println("Empty LinkedList");
        //     return;
        // }
        // if(head.data==data){
        //     head=head.next;
        //     return;
        // }
        // while(current.next != null){
        //     if(current.next.data==data){
        //         current.next = current.next.next;
        //         return;
        //     }
        //     current = current.next;
        // }
        // System.out.println("No element found");
        // return;
        if(head != null){
            if(head.data == data){
                head=head.next;
                return;
            }
            while(current.next != null && current.next.data != data)
                current = current.next;
            if(current.next != null){
                current.next = current.next.next;
                return;
            }
        }
        else
            System.out.println("Empty Linked List");
        System.out.println("Element Not Found!");
    }

    public void printValues(){
        
        Node current = head;

        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

public class LinkedList_Java {
    public static void main(String a[]){
        LinkedList nums = new LinkedList();
        nums.add(4);
        nums.add(9);
        nums.add(6);
        nums.addFirst(8);
        nums.delete(8);

        nums.printValues();
    }
}
