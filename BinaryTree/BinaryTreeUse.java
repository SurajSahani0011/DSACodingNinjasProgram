package BinaryTree;

import java.util.Scanner;

public class BinaryTreeUse {

    public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter root data");
        } else {
            if (isLeft) {
                System.out.println("Enter left of the child of" + parentData);
            } else {
                System.out.println("Enter right child of" + parentData);
            }
        }
        // System.out.println("Enter root data");
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();

        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
        BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    public static BinaryTreeNode<Integer> takeTreeInput() {
        System.out.println("Enter root data");
        Scanner s = new Scanner(System.in);
        int rooData = s.nextInt();

        if (rooData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rooData);
        BinaryTreeNode<Integer> leftChild = takeTreeInput();
        BinaryTreeNode<Integer> rightChild = takeTreeInput();
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
        // TODO take care of base case
        if (root == null) {
            return;
        }
        System.out.print(root.data + ":");
        if (root.left != null) {
            System.out.println("L" + root.left.data + ", ");
        }
        if (root.right != null) {
            System.out.println("R" + root.right.data);
        }
        System.out.println();

        printTreeDetailed(root.left);
        printTreeDetailed(root.right);

    }

    public static void printTree(BinaryTreeNode<Integer> root) {
        // TODO take care of base case
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);

        // if (root.right != null) {
        // printTree(root.left);
        // }
        // if (root.right != null) {
        // printTree(root.right);
        // }

    }

    public static int numNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int leftNumCount = numNodes(root.left);
        int rightNumCount = numNodes(root.right);
        return 1 + leftNumCount + rightNumCount;
    }

    public static int getSum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int leftSum = getSum(root.left);
        int rightSum = getSum(root.right);

        return (leftSum + rightSum + root.data);
    }

    public static void preOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static int largest(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return -1;
        }

        int largestLeft = largest(root.left);
        int largestRight = largest(root.right);
        return Math.max(root.data, Math.max(largestLeft, largestRight));
    }

    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
        if (root == null) {
            return 0;

        }

        int count = (root.data > x) ? 1 : 0;

        if (root.left != null) {
            count += countNodesGreaterThanX(root.left, x);
        }
        if (root.right != null) {
            count += countNodesGreaterThanX(root.right, x);
        }
        return count;
    }

    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static int numLeaves(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        return numLeaves(root.left) + numLeaves(root.right);
    }

    public static void printAtDepthK(BinaryTreeNode<Integer> root, int K) {
        if (root == null) {
            return;
        }

        if (K == 0) {
            System.out.println(root.data);
            return;
        }

        printAtDepthK(root.left, K - 1);
        printAtDepthK(root.right, K - 1);
    }

    private static void changeToDepthTreeHelper(BinaryTreeNode<Integer> root, int lavel) {
        if (root == null) {
            return;
        }

        root.data = lavel;

        changeToDepthTreeHelper(root.left, lavel + 1);
        changeToDepthTreeHelper(root.right, lavel + 1);
    }

    public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
        changeToDepthTreeHelper(root, 0);
    }

    // Assignment problem
    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
        if (root == null) {
            return false;
        }

        if (root.data.equals(x)) {
            return true;
        }

        return (isNodePresent(root.left, x) || isNodePresent(root.right, x));
    }

    public static void printNodeWithoutSibling(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right != null) {
            System.out.print(root.right.data + " ");
        } else if (root.left != null && root.right == null) {
            System.out.print(root.left.data + " ");
        }

        printNodeWithoutSibling(root.left);
        printNodeWithoutSibling(root.right);
    }

    public static void main(String[] args) {
        // BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);

        // BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
        // BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
        // root.left = rootLeft;
        // root.right = rootRight;
        // BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
        // BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);
        // rootLeft.right = twoRight;
        // rootLeft.left = threeLeft;

        // BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        // printTreeDetailed(root);

        // BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        // System.out.println("numOfNodes" + numNodes(root));

        // BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        // System.out.println("sumOfAllNodes" + " " + getSum(root));

        // BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        // preOrder(root);

        // BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        // postOrder(root);

        // BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        // System.out.println("largest" + largest(root));

        // BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        // int result = countNodesGreaterThanX(root, 3);
        // System.out.println("Number of nodes greater than " + 3 + ": " + result);

        // BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        // System.out.println("hieght of tree" + " " + height(root));

        // BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        // System.out.println("Number of Leaf Nodes" + " " + numLeaves(root));

        // BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        // System.out.println("print At Depth K" + " ");
        // printAtDepthK(root, 2);

        // BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        // changeToDepthTree(root);
        // printTree(root);

        // BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        // System.out.println("Node Present is" + " " + isNodePresent(root, 8));

        BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        System.out.println("Nodes without siblings:");
        printNodeWithoutSibling(root);

    }

}
