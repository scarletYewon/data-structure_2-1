package ds;

public class DList<E> implements List<E>{
    DLink<E> head,tail;
    int size;
    public DList(){
        head = new DLink<E>(null,null,tail);
        tail = new DLink<E>(null,head,null);
        size = 0;
    }
    class DLink<E> {
        E item;
        DLink<E> next;
        DLink<E> prev;
        public DLink(E item, DLink<E> prev, DLink<E> next){
            this.item = item; this.prev = prev; this.next = next;
        }
    }
    public void clear(){
        head.next = tail;
        tail.prev = head;
        size = 0;
    }
    public void insert(int pos, E item){
        DLink<E> curr = head;
        for(int i=0; i<pos; i++){
            curr = curr.next;
        }
        curr.next = new DLink<E>(item,curr,curr.next);
        curr.next.next.prev = curr.next;
        size++;
    }
    public void append(E item){
        DLink<E> n = new DLink<E>(item,tail.prev,tail);
        tail.prev.next = n;
        tail.prev = n;
        size++;
    }
    public void update(int pos, E item){
        DLink<E> curr = head;
        for(int i=0; i<pos; i++){
            curr = curr.next;
        }
        curr.next.item = item;
    }
    public E getValue(int pos){
        DLink<E> curr = head;
        for(int i=0; i<pos; i++){
            curr = curr.next;
        }
        return curr.next.item;
    }
    public E remove(int pos){
        DLink<E> curr = head;
        for(int i=0; i<pos; i++){
            curr = curr.next;
        }
        E ret = curr.next.item;
        curr.next.next.prev = curr;
        curr.next = curr.next.next;
        size--;
        return ret;
    }
    public int length() { return size; }
    public String toString(){
        String a = "[ ";
        DLink<E> curr=head;
        for(int i=0; i<size; i++){
            a+= curr.next.item+" ";
            curr = curr.next;
        }
        a+= "]";
        return a;
    }

    public ListIterator<E> listIterator(){
        return new ListIterator<E>() {
            DLink<E> curr = head;
            public boolean hasNext(){
                return curr.next != tail;
            }
            public E next(){
                curr = curr.next;
                return curr.item;
            }
            public boolean hasPrevious(){
                return curr != head;
            }
            public E previous() {
                curr = curr.prev;
                return curr.next.item;
            }
        };
    }
//    public static void main(String[] args){
//        List<Integer> myList = new DList<>();
//
//        myList.append(3);
//        myList.insert(0, 1);
//        myList.insert(0, 4);
//        myList.append(10);
//        myList.insert(1,5);
//        System.out.println(myList);
//        System.out.println(myList.length());
//        myList.clear();
//        System.out.println(myList.length());
//    }

}