public class LinkedList {
    Node head;
    public LinkedList() {
        this.head = null;
    }
    public void inserAtBegining(int element){
        Node newNode= new Node(element);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int element){
        Node newNode= new Node(element);
        if(head == null){
            head=newNode;
            return;
        }
        Node last=head;
        while(last.next != null){
            last=last.next;
        }
        last.next=newNode;
    }
    public void deleteByValue(int key){
            Node temp =head,prev=null;
            if(temp !=null && temp.data==key){
                head=temp.next;
                return;
            }
            while(temp != null && temp.data !=key){
                prev=temp;
                temp = temp.next;
            }
            if(temp==null)return;
            prev.next=temp.next;
    }
    public void traverse(){
        Node current = head;
        while(current != null){
            System.out.print(current.next+"-> ");
            current=current.next;
        }
        System.out.println("Null");
    }
    public boolean search(int key){
        Node current=head;
        while(current != null){
            if(current.data==key){
                return true;
            }
           current= current.next;
        }
        return false;
    }
    public int length(){
        int count=0;
        Node current =head;
        while (current != null) {
            count++;
            current=current.next;
        }
        return count;
    }
    public void reverse(){
        Node prev=null;
        Node current =null;
        Node next = null;
        while (current !=null) {
            next =current.next;
            prev=current;
            current=next;
        }
        head=prev;
    }
}
