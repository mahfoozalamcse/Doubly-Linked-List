

public class DoublyLL{

    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int d){
            data = d;
            prev = null;
            next = null;
        }

    }
    // insert at bigin 
    public static Node insertAtBigin(Node head, int data){
        Node temp = new Node(data);
        temp.next = head;

        if(head != null) 
            head.prev = temp;
            
        
        return temp;
    }
    public static Node insertAtEnd(Node head, int data){
        Node temp = new Node(data);
    
        if(head == null){
            return temp;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }

    // reverse Doubly Linked List
    public static Node reverseDLL(Node head){

      if (head == null || head.next == null) return head;
      Node curr = head, prev = null;
     
      while (curr != null) {
         prev = curr.prev;
         curr.prev = curr.next;
         curr.next = prev;
         curr = curr.prev;
      }
      return prev.prev;
    }

    // Delete head node 
    public static Node delethead(Node head){
        if(head == null) return null;

        if(head.next == null){
            return null;
        }else{
          head =  head.next;
          head.prev = null;
        }
        return head;

    }

    // Delete last node
    public static Node deleteLast(Node head){
        if(head == null) return null;
        if(head.next == null) return null;

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.prev.next = null;
        return head;
    }
    
    // cicular
    public static Node circularLL(Node head, int data){
         // circular linked List
    
     Node temp = new Node(data);
     if(head == null){
         temp.next = temp;
         temp.prev = temp;
     }
     temp.prev = head.prev;
     temp.next = head;
     head.prev.next = temp;
     head.prev = temp;
     return temp;
    
    }
   
   public static Node circularLLInsertEnd(Node head, int data){
         // circular linked List
    
     Node temp = new Node(data);
     if(head == null){
         temp.next = temp;
         temp.prev = temp;
     }
     temp.prev = head.prev;
     temp.next = head;
     head.prev.next = temp;
     head.prev = temp;
     return head;  // only one change from above code 
    
    }
    
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

       head.next = temp1;
       temp1.prev = head;
       temp1.next = temp2;
       temp2.prev = temp1;

       while (head != null) {
          System.out.print(head.data + "<=>");
          head = head.next;
       }
      
    //    Node data = insertAtBigin(head,5);
    //    System.out.println(data.data);

     // circular linked List
    
    
    }
}