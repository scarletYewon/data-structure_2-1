package ds;

public class ArrayStack<E> implements Stack<E> {
    private int top;
    private int size;
    private E[] stackArr;
    static int defaultSize = 10;

    public ArrayStack(){
        this(defaultSize);
    }
    public ArrayStack(int size){
        top = 0;
        stackArr = (E[]) new Object[size];
    }
    public void clear(){
        top = 0;
//        stackArr = (E[]) new Object[size];
    }
    public void push(E item){
        stackArr[top] = item;
        top++;
    }
    public E pop(){
        E ret = stackArr[top];
        top--;
        return ret;
    }
    public E topValue(){
        return stackArr[top-1];
    }
    public int length(){
        return top;
    }

    public String toString(){
        String a = "[ ";
        for(int i=0; i<top; i++){
            a += stackArr[i] + " ";
        }
        a+= "]";
        return a;
    }

//    public static void main(String[] args) {
//        ArrayStack<Integer> Stack = new ArrayStack<>(10);
//        Stack.push(3);
//        Stack.push(5);
//        Stack.push(7);
//        System.out.println(Stack.toString());
//        System.out.println(Stack.length());
//        Stack.pop();
//        System.out.println(Stack.length());
//        System.out.println(Stack.toString());
//        System.out.println(Stack.topValue());
//        Stack.clear();
//        System.out.println(Stack.toString());
//
//    }
}