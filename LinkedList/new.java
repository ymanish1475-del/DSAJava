// package LinkedList;

class LinkedList{
    Node head;
    void insert(int data ){
        Node newNode= new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node temp =head;
        while(temp.next !=null){
            temp= temp.next;
        }
        temp.next= newNode;
    }

    void print(){
        Node.temp=head;
    }
}
public class new {


    
    public static void main (String [] args){

    }
}
