import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-12-15
 * Time: 15:13
 */
class TreeNode {
    char value;
    TreeNode left;
    TreeNode right;
    public TreeNode(char value) {
        this.value = value;
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
        System.out.print(root.value+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // 中序遍历
    void inOrderTraversal(TreeNode root){
        if(root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.value+" ");
        inOrderTraversal(root.right);
    }

    // 后序遍历
    void postOrderTraversal(TreeNode root){
        if(root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value+" ");
    }

    /**
     * 左子树的节点个数+右子树的节点个数+1
     * @param root
     * @return
     */
    int getSize2(TreeNode root){
        if(root == null) {
            return 0;
        }
        int size = getSize2(root.left)
                +getSize2(root.right)+1;
        return size;
    }

    static int size = 0;

    void getSize1(TreeNode root){
        if(root == null) {
            return ;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);
    }

    // 子问题思路-求叶子结点个数
    int getLeafSize2(TreeNode root){
        if(root == null) {
            return 0;
        }else if(root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.left)
                +getLeafSize2(root.right);
    }
    // 遍历思路-求叶子结点个数
    static int leafSize = 0;

    void getLeafSize1(TreeNode root){
        if(root == null) {
            return ;
        }else if(root.left == null && root.right == null) {
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }

    int getKLevelSize(TreeNode root,int k){
        if(root == null) {
            return 0;
        }
        if(k == 1) {
            return 1;
        }
        return getKLevelSize(root.left,k-1)+
                getKLevelSize(root.right,k-1);
    }

    //前序遍历的形式去查找
    TreeNode find(TreeNode root, int val){
        if(root == null) {
            return null;
        }
        if(root.value == val) {
            return root;
        }

        TreeNode ret = find(root.left,val);
        if(ret != null) {
            return ret;
        }
        ret = find(root.right,val);
        if(ret != null) {
            return ret;
        }
        return null;
    }


}
