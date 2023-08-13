package Queue_Implementation;

class Queue {
    int size;
    int capacity;
    int arr[];

    Queue(int c) {
        capacity = c;
        size = 0;
        arr = new int[capacity];
    }

    boolean isFull(){
        return (size == capacity);
    }

    boolean isEmpty(){
        return (size == 0);
    }

    void enQueue(int x){
        if(isFull()){
            return;
        }
        arr[size] = x;
        size++;
    }

    void deQueue(){
        if(isEmpty()){
            return;
        }
        for(int i=0; i<size-1; i++){
            arr[i] = arr[i+1];
        }

        size--;
    }

    int getFront(){
        if(isEmpty()){
            return -1;
        }
        else{
            return arr[0];
        }
    }

    int getRear(){
        if(isEmpty()){
            return -1;
        }
        else{
            return arr[size-1];
        }
    }
}

class Array_Implementation_Of_Queue {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);

        System.out.println(q.isEmpty());
        System.out.println(q.isFull());

        System.out.println(q.getFront());
        System.out.println(q.getRear());

        q.deQueue();
        q.deQueue();
        System.out.println(q.getFront());
        System.out.println(q.getRear());

        q.deQueue();
        q.deQueue();
        q.deQueue();

        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
    }
}