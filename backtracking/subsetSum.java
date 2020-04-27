package backtracking;

/**
 * Subset sum problem is to find subset of elements that are selected from a given set whose sum adds up to a given number K.
 * We are considering the set contains non-negative values.
 * It is assumed that the input set is unique
 */

public class subsetSum {
    public static void main(String[] args){
        int weights[] = {10, 7, 5, 18, 12, 20, 15};
        int size = weights.length;

        generateSubsets(weights, size, 35);

    }

    private static void generateSubsets(int[] weights, int size, int key) {

    }
}
