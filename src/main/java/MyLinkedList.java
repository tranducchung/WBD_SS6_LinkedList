public class MyLinkedList {
    private Node head = null;
    private Node tail = null;
    private int numNodes;
    public MyLinkedList(Object data){
        head = new Node(data);
        numNodes++;
    }
    public MyLinkedList(){}
    private class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }
        public Object getData() {
            return this.data;
        }

    }
    public int getSize(){
        return numNodes;
    }
    public void add(int index,Object data){
        if(index == 0){
            addFirst(data);
        } else if (index == numNodes){
            addLast(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            Node temp;
            for(int i= 0;i<index-1;i++){
                current = current.next;
            }
            temp = current.next;
            current.next = newNode;
            newNode.next = temp;
        }
        numNodes++;
    }
    public void addFirst(Object data){
       if(head == null){
           Node newNode = new Node(data);
           head = newNode;
           tail = head;
       }else {
           Node newNode = new Node(data);
           newNode.next=head;
           head = newNode;
       }
        numNodes++;
    }
    public void addLast(Object data){
        if(head == null){
            Node newNode = new Node(data);
            head = newNode;
            tail = head;
        }else {
            Node newNode = new Node(data);
            tail.next = newNode;
            tail = newNode;
        }
        numNodes++;
    }
    public void remove(int index){
        if(head == null){
            System.out.println("List isEmpty");
            return;
        }
        if (index >= getSize() || index < 0){
            System.out.println("index = "+ index +" Size = "+ getSize());
            return;
        }
       if(index==0){
           head = head.next;
           numNodes--;
       }
        if(0 < index && index < getSize()){
            Node temp = head;
            Node current;
            for (int i =0;i<index-1;i++){
                temp = temp.next;
            }
            current = temp.next.next;
            temp.next = current;
            numNodes--;
        }
         System.out.println("Remove success ");;
    }
    public String getdata(int index){
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return " list " + index + " is "+ temp.data;
    }
    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
