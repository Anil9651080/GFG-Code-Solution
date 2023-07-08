import java.util.ArrayList;

import org.w3c.dom.Node;

public class Left_View_of_Binary_Tree {
    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        leftRootEle(root, ans, 0);
        return ans;
    }

    static void leftRootEle(Node root, ArrayList<Integer> ans, int level) {
        if (root == null) {
            return;
        }
        if (ans.size() == level) {
            ans.add(root.data);
        }
        leftRootEle(root.left, ans, level + 1);
        leftRootEle(root.right, ans, level + 1);
    }
}
