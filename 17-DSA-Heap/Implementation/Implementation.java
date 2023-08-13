package Implementation;

import java.util.Scanner;

class MinHeap{
    int [] arr;
    int size;
    int capacity;

    MinHeap(int c){
        arr = new int[c];
        capacity = c;
    }

    int left(int i){
        return 2*i+1;
    }

    int right(int i){
        return 2*i+2;
    }

    int parent(int i){
        return (i-1)/2;
    }

    // Fill Heap-Array with input elements
    void fillArr(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Give the size: ");
        size = sc.nextInt();

        System.out.println("Input Numbers for the given size array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
    }

    // Printing Heap
    void printHeap(){
        System.out.print("Heap Elements are: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }

    // Heap Insert
    void insert(int x){
        if(size == capacity){
            return;
        }

        size++;
        arr[size-1] = x;

        for(int i=(size-1); i!=0 && arr[parent(i)]>arr[i];  ){
            // Swap(arr[parent(i)], arr[i])
            int t = arr[parent(i)];
            arr[parent(i)] = arr[i];
            arr[i] = t;

            i = parent(i);
        }
    }

    // Min-Heapify, Given a binar heap with one possible violation, fix the heap
    void minHeapify(int i){
        int lt = left(i);
        int rt = right(i);
        int smallest = i;

        if(lt<size && arr[lt]<arr[i]){
            smallest = lt;
        }

        if(rt<size && arr[rt]<arr[smallest]){
            smallest = rt;
        }

        if(smallest != i){
            // Swap(arr[i], arr[smallest])
            int t = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = t;

            minHeapify(smallest);
        }
    }

    // Extract Min
    int extractMin(){

        if(size == 0){
            return Integer.MAX_VALUE;
        }

        if(size == 1){
            size--;
            return arr[0];
        }

        // Swap(arr[0], arr[size-1])
        int t = arr[0];
        arr[0] = arr[size-1];
        arr[size-1] = t;

        size--;
        minHeapify(0);
        
        return arr[size];
    }


    // Decrease Key: Goto an index in Heap and Insert the given value
    void decreaseKey(int i, int x){
        arr[i] = x;
        while(i != 0 && arr[parent(i)]>arr[i]){
            // swap(arr[parent(i)], arr[i])
            int t = arr[parent(i)];
            arr[parent(i)] = arr[i];
            arr[i] = t;

            i = parent(i);
        }
    }


    // Delete: delete value at given index, and rebuild the heap
    void delete(int ind){
        int min = Integer.MIN_VALUE;
        decreaseKey(ind, min);
        extractMin();
    }


    // Build Heap
    void buildHeap(){
        for(int i=(size-2)/2; i>=0; i--){
            minHeapify(i);
        }
    }
}

class Implementation {
    public static void main(String[] args) {
        // Create heap with capacity c
        MinHeap h = new MinHeap(10);

        // Fill heap array
        h.fillArr();
        System.out.println("Heap provided by you: ");
        h.printHeap();
        System.out.println();


        // 1.Insert new element into heap
        // int x = 12;
        // h.insert(x);
        // System.out.println("After inserting " + x +" into heap: ");
        // h.printHeap();


        // 2.Min-Heapify
        // h.minHeapify(0);
        // System.out.println("After Heapify: ");
        // h.printHeap();


        // 3.Extract Min
        // int min = h.extractMin();
        // System.out.println("Min from the given heap is: " + min);
        // System.out.println();
        // System.out.println("After extractig min, the heap is right now: ");
        // h.printHeap();


        // 4.Decrease key
        // int ind = 3;
        // int val = 5;
        // h.decreaseKey(ind, val);
        // System.out.println("After inserting " + val + " at index " + ind + "  the heap is right now: ");
        // h.printHeap();


        // 5.Delete
        int delInd = 3;
        h.delete(delInd);
        System.out.println("After deleting the value at index " + delInd + ",  the heap is right now: ");
        h.printHeap();


        // // 6.Build Heap
        // h.buildHeap();
        // System.out.println("The new heap is: ");
        // h.printHeap();        
    }
}