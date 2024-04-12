public class LL {

    private Node head;
    private Node tail;

    int size=0;

    public LL(){
        this.size=0;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertatFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size +=1;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        } 
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.insertatFirst(1);
        list.insertatFirst(2);
        list.insertatFirst(3);
        list.insertatFirst(4);

        list.display();
    }
}
