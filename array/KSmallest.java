package array;


import Utility.MaxHeap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KSmallest {

    // Method 1 simple sort - NLogN
    static int simpleSort(Integer[] array, int k){
        int kth;
        if (array.length == 1)
            return array[0];
        else {
            Arrays.sort(array);
        }
        return array[k-1];
    }

    // Method 2 - Max Heap
    static int heapSort ( Integer[] arr, int k ){

        MaxHeap heap = new MaxHeap(arr.length);
        for ( int i = 0; i < arr.length; i++) {
            heap.insert(arr[i]);
//            heap.print();
        }
        for ( int i =arr.length; i > k ; i--){
            heap.extractMax();
        }
//        heap.print();
        return heap.extractMax();
    }


    public static void main ( String[] args) {
        Integer array[] = new Integer[] {1,8,5,9,10,23,3};
        int k =5;
        System.out.println("Simple Sort Method "+ simpleSort(array, k) );
        System.out.println("Heap Sort Method " +  heapSort(array, k) );

    }
}
