public class App {
    public static void main(String[] args) {
       MyLinkedList myLinkedList = new MyLinkedList();
       myLinkedList.addFirst(2);
       myLinkedList.addFirst(3);
       myLinkedList.addFirst(4);
       myLinkedList.addLast( 5);
       myLinkedList.remove(2);
       myLinkedList.remove(4);
       myLinkedList.remove(1);
        for(int i=0;i<myLinkedList.getSize();i++){
            System.out.println(myLinkedList.getdata(i));
        }
    }
}
