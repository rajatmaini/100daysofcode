class queue
{
    int[] arr;
    int size,front,rear;
    queue(int size)
    {
        this.size = size;
        arr = new int[size];
        front = rear = -1;
    }
    void enqueue(int a)
    {
        if(isFull())
        {
            System.out.println("Overflow");
            System.exit(1);
        }
        else
        {
            if(front == -1)
            {
                front = 0;
            }
            rear++;
            arr[rear] = a;
        }
    }
    int dequeue()
    {
        int element = arr[front];
        if(isEmpty())
        {
            System.out.println("Empty!");
            System.exit(1);
        }
        else
        {
            if(front >= rear)
            {
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }
        }
        return element;
    }
    boolean isFull()
    {
        return (front == 0 && rear == size -1);
    }
    boolean isEmpty()
    {
        return (front == -1 && rear == -1);
    }
    void display()
    {
        for (int i = front;i<=rear;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
public class trys {
    public static void main(String[] args)
    {
        queue q = new queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.display();
        System.out.println();
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println();
        q.display();
    }
}
