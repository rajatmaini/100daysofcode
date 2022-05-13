class stack
{
    private final int[] arr;
    private int top;
    private final int capacity;
    stack(int size)
    {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    void push(int a)
    {
        if(isFull())
        {
            System.out.println("Overflow");
            System.exit(1);
        }
        arr[++top] = a;
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty!");
        }
        return arr[top--];
    }
    boolean isFull()
    {
        return top == capacity - 1;
    }
    boolean isEmpty()
    {
        return top==-1;
    }
    int peek()
    {
        if(isEmpty())
        {
            System.out.println("Empty Stack");
            System.exit(1);
        }
        return arr[top];
    }
    void print_stack()
    {
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
public class trys {
    public static void main(String[] args)
    {
        stack s = new stack(5);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.print_stack();

    }
}
