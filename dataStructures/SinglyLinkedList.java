package dataStructures;

public class SinglyLinkedList {
    private Node head;
    private int size =0;

    private class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
        }

    }

    // default constructor
    public SinglyLinkedList() {
    }

    public void addFirst(int data) {

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void add(int data) {

        if (head == null)
            addFirst(data);
        else {
            Node newNode = new Node(data);
            newNode.next = null;

            Node current = head;
            while (current.next != null)
                current = current.next;
            current.next = newNode;
            size++;
        }
    }

    public void addLast(int data) {
        if (head == null)
            addFirst(data);
        else add(data);
    }

    public void add(int index, int data){
        if(index < 1 || index > size) System.out.println("Invalid Position");
        else if(index == 0 ) addFirst(data);
        else if(index == size) add(data);
        else{
            int tempIndex = 0;

            Node current = head;
            while(tempIndex < index-1){
                current = current.next;
                tempIndex++;
            }
            Node newNode = new Node(data);
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
      
    }

    public void reverseList(){

        Node prev = null;
        
        Node current = head;

        while(current != null){
            Node tempNode = current.next;
            
            current.next = prev;
            prev = current;
            current = tempNode;
            
        }

        head = prev;
    }



    public int getSize(){ return size;}

    public void printList() {
        if (head == null)
            System.out.println("List is empty");
        else {
            Node current = head;
            StringBuilder sb = new StringBuilder();
            while (current != null ) {
                if(current.next == null) sb.append(current.data);
                else{
                    sb.append(current.data + "->");
                }
                current = current.next;
            }
            System.out.println(sb.toString());
        }

    }


    public int getSizeIterable(){
        Node current = head;
        int count =0;
        while(current !=null){
            current = current.next;
            count++;
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
