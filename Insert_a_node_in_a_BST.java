import org.w3c.dom.Node;

public class Insert_a_node_in_a_BST {
    Node insert(Node root, int Key) {
        if (root == null) {
            return new Node(Key);

        }
        if (root.data == Key) {
            return root;
        }
        if (root.data < Key) {
            root.right = insert(root.right, Key);
        } else {
            root.left = insert(root.left, Key);
        }
        return root;
    }
}
