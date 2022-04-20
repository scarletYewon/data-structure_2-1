package ds;

public class LinkedQueue<E> implements Queue<E> {
    Link<E> front,rear;
    int size;

    public LinkedQueue(){
        front = rear = new Link<E>(null,null);
        size = 0;
    }
    public void clear(){
        front.next = null;
        rear = front;
        size = 0;
    }
    public void enqueue(E it){
        Link<E> n = new Link<E>(it,null);
        rear.next = n;
        rear = n;
        size++;
    }
    public E dequeue(){
        E ret = front.next.item;
        front.next.item=null;
        front = front.next;
        size--;
        return ret;
    }
    public E frontValue(){
        return front.next.item;
    }
    public int length(){
        return size;
    }
    public String toString() {
        String a = "[ ";
        Link<E> curr = front;
        for (int i = 0; i < size; i++) {
            a += curr.next.item + " ";
            curr = curr.next;
        }
        a += "]";
        return a;
    }

//    public static void main(String args[]){
//        Queue<Integer> Queue = new LinkedQueue<>();
//        Queue.enqueue(10);
//        Queue.enqueue(20);
//        Queue.enqueue(30);
//        System.out.println(Queue.toString());
//        Queue.dequeue();
//        System.out.println(Queue.toString());
//        System.out.println(Queue.frontValue());
//        System.out.println(Queue.length());
//    }
}