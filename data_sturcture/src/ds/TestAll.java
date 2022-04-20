package ds;

public class TestAll {

    public static void main(String[] args) {
        List<Integer> myList = new DList<>(); //DList
        ArrayStack<Integer> stack = new ArrayStack<>(10);
        Queue<Integer> queue = new LinkedQueue<>();

        //Dlist//
        System.out.println("< DList >");
        myList.append(3);
        myList.insert(0, 1);
        myList.insert(0, 4);
        myList.append(10);
        myList.insert(1,5);
        System.out.println(myList);
        System.out.println("length : " + myList.length());
        System.out.println("length : " + myList.length());

        //ListIterator//
        ListIterator<Integer> myListIterator = myList.listIterator();
        while(myListIterator.hasNext()){
            System.out.print(myListIterator.next() + " ");
        }
        System.out.println();
        while(myListIterator.hasPrevious()){
            System.out.print(myListIterator.previous() + " ");
        }
        System.out.println();

        // //

        myList.clear();
        System.out.println("clear헀습니다 !");
        System.out.println("length : " + myList.length());

        //Stack//
        System.out.println("< Stack >");
        stack.push(3);
        stack.push(5);
        stack.push(7);
        System.out.println(stack);
        System.out.println("length : " + stack.length());
        stack.pop();
        System.out.println("length : " + stack.length());
        System.out.println(stack);
        System.out.println("topValue : " + stack.topValue());
        stack.clear();
        System.out.println("clear헀습니다 !");
        System.out.println(stack);

        //Queue//
        System.out.println("< Queue >");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        System.out.println("frontValue : " + queue.frontValue());
        System.out.println("length : " + queue.length());

    }
}
