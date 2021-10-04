package latihan;

public class ListNode{
    //float value
    private int node;
    //ListNode next
    private ListNode next;

    //primitif

    public ListNode(){
        this.node = 0;
        this.next = null;
    }

    public ListNode(int node){
        this.node = node;
        this.next = null;
    }

    // getter
    public int getNode (){
        return this.node;
    }

    public ListNode getNextNode (){
        return this.next;
    }

    // setter
    public void setNode(int node){
        this.node = node;
    }

    public void setNextNode (ListNode next){
        this.next = next;
    }



}