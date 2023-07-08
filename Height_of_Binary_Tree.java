import org.w3c.dom.Node;

public class Height_of_Binary_Tree {
    int height(Node node) {
        // code here
        if (node == null) {
            return 0;
        }
        int left = height(node.left) + 1;
        int right = height(node.right) + 1;
        return Math.max(left, right);

    }
}
