import java.util.ArrayList;
import java.util.Collections;

import org.w3c.dom.Node;

public class Kth_largest_element_in_BST {
    ArrayList<Integer> arr = new ArrayList<Integer>();

    public int kthLargest(Node root, int K) {

        if (root == null) {
            return -1;
        }
        inorder(root);
        Collections.sort(arr, Collections.reverseOrder());
        return arr.get(K - 1);
    }

    public void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        arr.add(node.data);
        inorder(node.right);
    }
}
