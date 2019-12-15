import sun.reflect.generics.tree.Tree;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -12 -15
 * Time: 15:43
 */
class TreeNode {
    char val;
    TreeNode left;
    TreeNode right;
    public TreeNode(char val) {
        this.val = val;
    }
}
public class BinaryTree {
    public BinaryTree() {

    }
    public TreeNode buildTree() {
        TreeNode root = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        root.left = B;
        root.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return root;
    }
    // 前序遍历
    void preOrderTraversal(TreeNode root){
        if(root == null) {
            return;
        }
        System.out.print(root.val+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // 中序遍历
    void inOrderTraversal(TreeNode root){
        if(root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
    }

    // 后序遍历
    void postOrderTraversal(TreeNode root){
        if(root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val+" ");
    }

    int getLeafSize2(TreeNode root) {
        if(root == null) {
            return 0;
        }else if(root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }

    //求第k层有多少个结点
    //求当前root的第k层，就相当于求当前root.left的k-1层 + root.right 的第k+1层
    int getKLevelSize(TreeNode root,int k) {
        if(root == null) {
           return 0;
        }else if(k == 1) {
            return 1;
        }
        return getKLevelSize(root.left,k-1) + getKLevelSize(root.right,k-1);
    }

    //查找val所在结点
    TreeNode find(TreeNode root,char val) {
        if(root == null) {
            return null;
        }
        if(root.val == val) {
            return root;
        }
        //如果root不是，从左树找，从右树找
        TreeNode node = find(root.left,val);
        //判断左树是否含有val所在结点
        if(node != null) {
            return node;
        }
        return find(root.right,val);
    }
}
