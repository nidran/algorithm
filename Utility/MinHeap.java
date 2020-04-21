package Utility;

public class MinHeap {
    private int heap[];
    private int size;
    private int maxSize;

    public MinHeap(int size)
    {
        this.maxSize = size;
        this.size = 0;
        heap = new int[maxSize + 1];
        heap[0] = Integer.MAX_VALUE;
    }
}
