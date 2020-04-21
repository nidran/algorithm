package Utility;

public class MaxHeap {

    private int[] heap;
    private int size;
    private int maxSize;

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        heap = new int[maxSize + 1];
        heap[0] = Integer.MAX_VALUE;
    }

    private int parent ( int pos ){
        return pos/2;
    }

    private int leftChild ( int pos){
        return 2*pos;
    }
    private int rightChild ( int pos){
        return 2*pos +1;
    }
     private boolean isLeaf ( int pos){
        if (pos >=size/2  && pos <=size)
            return true;
        return false;
    }
     private void swap (int fpos, int lpos){
        int temp = heap[fpos];
        heap[fpos]=heap[lpos];
        heap[lpos]= temp;
     }
    // A recursive function to max heapify the given
    // subtree. This function assumes that the left and
    // right subtrees are already heapified, we only need
    // to fix the root.

    private void maxHeapify (int pos){

        if (isLeaf(pos))
            return;
        if (heap[pos] < heap[leftChild(pos)] || heap[pos]< heap[rightChild(pos)]){
            if (heap[leftChild(pos)] > heap[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            }
            else {
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
            }

        }
    }

    public void insert(int element)
    {
        heap[++size] = element;

        // Traverse up and fix violated property
        int current = size;
        while (heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public void print()
    {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + heap[i] + " LEFT CHILD : " +
                    heap[2 * i] + " RIGHT CHILD :" + heap[2 * i + 1]);
            System.out.println();
        }
        for (int i = 1; i <= size ; i++){
            System.out.println(heap[i]);
        }
    }

    public int extractMax()
    {
        int popped = heap[1];
        heap[1] = heap[size--];
        maxHeapify(1);
        return popped;
    }

    public static void main(String[] arg)
    {
        System.out.println("The Max Heap is ");
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

        maxHeap.print();
        System.out.println("The max val is " + maxHeap.extractMax());
    }
}

