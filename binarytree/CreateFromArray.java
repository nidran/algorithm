//package binarytree;
///*
//Construct a complete binary tree from given array in level order fashion
//Input  :  arr[] = {1, 2, 3, 4, 5, 6}
//Output : Root of the following tree
//                  1
//                 / \
//                2   3
//               / \ /
//              4  5 6
//
// */
//
//public class CreateFromArray {
//
//    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        Integer[] arr = new Integer[n];
////        for (int i = 0; i < n; i++) {
////            arr[i] = sc.nextInt();
////        }
//
//        int n=6;
//        Integer[] arr = {1,2,3,4,5,6,7,8};
////        printArray(arr);
//
//        BinaryTree bin = new BinaryTree();
//        bin = insertLvl(arr, 0, arr.length, bin);
//        System.out.println("Inorder Traversal ");
//        printInorder(bin);
//
//        System.out.println("PreOrder Traversal ");
//        printPreOrder(bin);
//
//        System.out.println("PostOrder Traversal ");
//        printPostOrder(bin);
//    }
//
//    private static void printInorder(BinaryTree bin) {
//        if (null == bin)
//            return;
//            printInorder(bin.root.left);
//            System.out.println(bin.root.data + " ");
//            printInorder(bin.root.right);
//
//    }
//
//    private static void printPreOrder(BinaryTree bin) {
//        System.out.println(bin.root.data + " ");
//        if (null == bin)
//            return;
//        printInorder(bin.root.left);
//        printInorder(bin.root.right);
//
//    }
//
//    private static void printPostOrder(BinaryTree bin) {
//
//        if (null == bin)
//            return;
//        printInorder(bin.root.left);
//        printInorder(bin.root.right);
//        System.out.println(bin.root.data + " ");
//
//    }
//
//    private static BinaryTree insertLvl(Integer[] arr, int start, int end, BinaryTree node) {
//
//        if (start < end) {
//            node = new BinaryTree(arr[start]);
//            node.root.left = insertLvl(arr, 2 * start + 1, end, node.root.left);
//            node.root.right = insertLvl(arr, 2 * start + 2, end, node.root.right);
//
//
//        }
//        return node;
//    }
//}
