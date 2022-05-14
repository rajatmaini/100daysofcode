class queue
{
    int[] arr;
    int size,top,rear;
    int element;
    queue(int size)
    {
        this.size = size;
        arr = new int[size];
        top = rear = -1;
    }
    void enque(int a)
    {
        if(isFull())
        {
            System.out.println("Overflow");
            System.exit(1);
        }
        else{
            if(top == -1)
            {
                top = 0;
            }
        }
        rear++;
        arr[rear] = a;
    }
    boolean isFull()
    {
        return (top == 0 && rear == size -1);
    }
    boolean isEmpty()
    {
        return top == -1;
    }
    int deque()
    {
        if(isEmpty())
        {
            System.out.println("Problem");
            System.exit(1);
        }
        else
        {
            element = arr[top];
            if(top >= rear)
            {
                top = -1;
                rear = -1;
            }
            else
            {
                top++;
            }
        }
        return element;
    }
    void display()
    {
        for(int i: arr)
        {
            System.out.println(i);
        }
    }
}
public class trys {
    public static void main(String[] args)
    {
        queue q = new queue(4);
        q.enque(1);
        q.enque(1);
        q.enque(1);
        q.enque(1);
        System.out.println(q.deque());
        q.display();
    }
}
