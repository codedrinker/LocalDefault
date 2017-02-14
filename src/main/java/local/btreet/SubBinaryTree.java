package local.btreet;

/**
 * Created by codedrinker on 4/21/16.
 */
public class SubBinaryTree {
    public static int isSubTree(TNode root1, TNode root2) {
        if (root1 == null && root2 == null) {
            return 1;
        }
        if (root2 == null) {
            return -1;
        }
        if (root1 == null) {
            return -1;
        }

        if (root1.value == root2.value) {
            int left = isSubTree(root1.left, root2.left);
            int right = isSubTree(root1.right, root2.right);
            return left == 1 && right == 1 ? 1 : -1;
        } else {
            int left = isSubTree(root1.left, root2);
            int right = isSubTree(root1.right, root2);
            return right == 1 || left == 1 ? 1 : -1;
        }
    }

    public static void main(String[] args) {

        TNode root3 = new TNode();
        root3.value = 2;

        TNode root2 = new TNode();
        root2.value = 1;
        root2.left = root3;

        TNode root1 = new TNode();
        root1.value = 1;
        root1.left = root2;



        System.out.println(isSubTree(root1, root2));
    }
}

class TNode {
    public int value;
    public TNode left;
    public TNode right;
}
