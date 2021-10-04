package latihan;

public class LinkedList{
    //atribut ListNode head;
    private ListNode head;

    //primitif
    public LinkedList(){
        this.head = null;
    }

    public ListNode getHead(){
        return this.head;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public String toString(){
        ListNode current = head;
        String temp = "";
        while (current != null){
            temp += current.getNode() + ", ";
            current = current.getNextNode();
        }
        return (temp);
    }
    //implementasikan inserFirst
    public void insertFirst(int data){
        ListNode newNode = new ListNode();
        newNode.setNode(data);
        newNode.setNextNode(null);
        newNode.setNextNode(this.head);
        this.head = newNode;

    }

    //implementasikan inserAftter
    public void insertAfter(ListNode prev_node, int data){
        ListNode newNode = new ListNode();
        newNode.setNode(data);
        newNode.setNextNode(null);

        newNode.setNextNode(prev_node.getNextNode());
        prev_node.setNextNode(newNode);

    }

    // implementasi deleteFirst
    public ListNode deleteFisrt(){
        ListNode temp;
        temp = this.head;
        this.head = temp.getNextNode();
        temp.setNextNode(null);
        return temp;
    }

    public ListNode deleteAfter(ListNode prev_node){

        ListNode temp;
        temp = prev_node.getNextNode();
        prev_node.setNextNode(temp.getNextNode());
        temp.setNextNode(null);
        return temp;
    }

    // implementasi delete last
    public ListNode deleteLast(){
        if (head == null)
            return null;
        if (head.getNextNode() == null)
            return deleteFisrt();

        ListNode current = head;
        ListNode previous = null;

        while(current.getNextNode() != null){
            previous = current;
            current = current.getNextNode();
        }
        previous.setNextNode(null);
        return current;
    }



    //implementasikan append
    public void append (int data){

        ListNode newNode = new ListNode();
        newNode.setNode(data);
        newNode.setNextNode(null);

        if (isEmpty()){
            head = newNode;
            return;
        }
        ListNode lastNode = head;
        while(lastNode.getNextNode() != null){
            lastNode = lastNode.getNextNode();
        }
        lastNode.setNextNode(newNode);

    }

    public int getFirstIndex(){
        if(isEmpty())
            System.out.println("List Empty");
        return this.head.getNode();
    }

    public int getLastIndex(){
        if(isEmpty())
            System.out.println("List Empty");
        ListNode lastNode = head;
        while(lastNode.getNextNode() != null){
            lastNode = lastNode.getNextNode();
        }
        return lastNode.getNode();
    }

}