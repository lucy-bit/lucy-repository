import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: nannan
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
    void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    void preOrderTraversalNor(TreeNode root) {
        Stack<TreeNode > stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                System.out.print(cur.value + " ");
                cur = cur.left;
            }
            cur = stack.pop();
            cur = cur.right;
        }
    }
    List<Character> preOrderTraversalNor2(TreeNode root) {
        List<Character> list = new ArrayList<>();
        Stack<TreeNode > stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                System.out.print(cur.value + " ");
                list.add(cur.value);
                cur = cur.left;
            }
            cur = stack.pop();
            cur = cur.right;
        }
        return list;
    }

    // 中序遍历
    void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.value + " ");
        inOrderTraversal(root.right);
    }

    // 后序遍历
    void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value + " ");
    }

    void postOrderTraversalnNor(TreeNode root) {
        Stack<TreeNode > stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            //cur = null;  异议
            cur = stack.peek();
            if(cur.right == null || cur.right == prev) {
                stack.pop();
                System.out.print(cur.value+" ");
                prev = cur;
                cur = null;
            }else {
                cur = cur.right;
            }
        }

    }

    /**
     * 左子树的节点个数+右子树的节点个数+1
     *
     * @param root
     * @return
     */
    int getSize2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int size = getSize2(root.left)
                + getSize2(root.right) + 1;
        return size;
    }

    static int size = 0;

    void getSize1(TreeNode root) {
        if (root == null) {
            return;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);
    }

    // 子问题思路-求叶子结点个数
    int getLeafSize2(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.left)
                + getLeafSize2(root.right);
    }

    // 遍历思路-求叶子结点个数
    static int leafSize = 0;

    void getLeafSize1(TreeNode root) {
        if (root == null) {
            return;
        } else if (root.left == null && root.right == null) {
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }

    int getKLevelSize(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return getKLevelSize(root.left, k - 1) +
                getKLevelSize(root.right, k - 1);
    }

    //前序遍历的形式去查找
    TreeNode find(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.value == val) {
            return root;
        }

        TreeNode ret = find(root.left, val);
        if (ret != null) {
            return ret;
        }
        ret = find(root.right, val);
        if (ret != null) {
            return ret;
        }
        return null;
    }

    public void binaryTreePrevOrderNonR(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                System.out.print(cur.value + " ");
                cur = cur.left;
            }
            TreeNode top = stack.pop();
            cur = top.right;
        }
    }

    public void binaryTreeInOrderNonR(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode top = stack.pop();
            System.out.print(top.value + " ");
            cur = top.right;
        }
    }

    public void binaryTreePostOrderNonR(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if (cur.right == null || cur.right == prev) {
                stack.pop();
                System.out.print(cur.value + " ");
                prev = cur;
                cur = null;
            } else {
                cur = cur.right;
            }
        }
    }

    public void binaryTreeLevelOrder1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            System.out.print(cur.value+" ");
            if(cur.left != null) {
                queue.offer(cur.left);
            }
            if(cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }
    public List<List<Character>> binaryTreeLevelOrder2(TreeNode root) {
        List<List<Character>> ret = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Character> list = new ArrayList<>();
            while (size > 0) {
                TreeNode cur = queue.poll();
                System.out.print(cur.value+" ");
                list.add(cur.value);
                if(cur.left != null) {
                    queue.offer(cur.left);
                }
                if(cur.right != null) {
                    queue.offer(cur.right);
                }
                size--;
            }
            ret.add(list);
        }
        return ret;
    }
    // 层序遍历
    void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            System.out.print(cur.value+" ");
            if(cur.left != null) {
                queue.offer(cur.left);
            }
            if(cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }

    public List<List<Character>> levelOrder2(TreeNode root) {
        List<List<Character>> ret = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            int size = queue.size();//4
            List<Character> list = new ArrayList<>();
            while (size > 0) {
                TreeNode cur = queue.poll();
                System.out.print(cur.value+" ");
                list.add(cur.value);
                size--;//0
                if(cur.left != null) {
                    queue.offer(cur.left);
                }
                if(cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            ret.add(list);
        }
        return ret;
    }
    // 判断一棵树是不是完全二叉树
    boolean isCompleteTree(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if(cur != null) {
                queue.offer(cur.left);
                queue.offer(cur.right);
            }else {
                break;
            }
        }
        while (!queue.isEmpty()) {
            TreeNode cur = queue.peek();
            if(cur != null) {
                return false;
            }else {
                queue.poll();
            }
        }
        return true;
    }
    public int i = 0;
    //str ===> 前序遍历："abc##de#g##f###"
    TreeNode buildTree(String str) {
        TreeNode root = null;
        if(str.charAt(i) != '#') {
            root = new TreeNode(str.charAt(i));
            i++;
            root.left = buildTree(str);
            root.right = buildTree(str);
        }else {
            i++;
        }
        return root;
    }

    TreeNode prev = null;
    public void ConvertChild(TreeNode pCur) {
        if(pCur == null) {
            return;
        }
        ConvertChild(pCur.left);
        pCur.left = prev;
        if(prev != null) {
            prev.right = pCur;
        }
        prev = pCur;
        ConvertChild(pCur.right);
    }

    //返回的是双向链表的头结点
    public TreeNode Convert(TreeNode pRootOfTree) {
        //这个函数，执行完成后，二叉搜索树的结构已经被改变了
        ConvertChild(pRootOfTree);
        TreeNode head = pRootOfTree;
        //一路向左
        while (head != null && head.left != null) {
            head = head.left;
        }
        return head;
    }
    /*
    //前序遍历的方式来写
class Solution {
    public TreeNode lowestCommonAncestor
    (TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return null;
        }
        if(root == p || root == q) {
            return root;
        }
        //开始以前序遍历的方式进行查找
        TreeNode leftTree = lowestCommonAncestor(root.left,p,q);
        TreeNode rightTree = lowestCommonAncestor(root.right,p,q);
        if(leftTree!= null && rightTree!= null) {
            return root;
        }
        if(leftTree!= null) {
            return leftTree;
        }
        if(rightTree != null) {
            return rightTree;
        }
        return null;
    }
}



//前序遍历的方式进行思考
class Solution {

    int preIndex = 0;

     public TreeNode buildTreeChild(int[] preorder,
    int[] inorder,int inbegin,int inend) {
         //判断是否有左树或者是右树
         if(inbegin > inend) {
             return null;
         }
         TreeNode root = new TreeNode(preorder[preIndex]);
         //找root在中序遍历的下标
         int rootIndex =
         findIndexOfInorder(inorder,inbegin,inend,preorder[preIndex]);
        preIndex++;

        root.left = buildTreeChild(preorder ,inorder,inbegin,
        rootIndex-1);

        root.right = buildTreeChild(preorder ,inorder
        ,rootIndex+1,inend);

        return root;
     }

     public int findIndexOfInorder(int[] inorder,int inbegin,
     int inend,int val){
         for(int i = inbegin;i <= inend;i++) {
             if(inorder[i] == val) {
                 return i;
             }
         }
         return -1;
     }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null) {
            return null;
        }
        if(preorder.length == 0 || inorder.length ==0) {
            return null;
        }

       return buildTreeChild(preorder,inorder,0,inorder.length-1);
    }
}


//中序后须创建
class Solution {
    public int postIndex = 0;

    public TreeNode buildTreeChild(int[] inorder,
     int[] postorder,int inbegin,int inend) {
         //判断是否有左树或者是右树
         if(inbegin > inend) {
             return null;
         }
         TreeNode root = new TreeNode(postorder[postIndex]);
         //找root在中序遍历的下标
         int rootIndex =
         findIndexOfInorder(inorder,inbegin,inend,postorder[postIndex]);
        postIndex--;

          root.right = buildTreeChild(inorder
        ,postorder ,rootIndex+1,inend);


        root.left = buildTreeChild(inorder ,postorder,inbegin,
        rootIndex-1);


        return root;
     }

     public int findIndexOfInorder(int[] inorder,int inbegin,
     int inend,int val){
         for(int i = inbegin;i <= inend;i++) {
             if(inorder[i] == val) {
                 return i;
             }
         }
         return -1;
     }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
     if(postorder == null || inorder == null) {
            return null;
        }
        if(postorder.length == 0 || inorder.length ==0) {
            return null;
        }
       postIndex = postorder.length-1;
       return buildTreeChild(inorder,postorder,0,inorder.length-1);
    }
}

class Solution {

    public void tree2strChild(TreeNode t,StringBuilder sb) {
        if(t == null) {
            return ;
        }
        sb.append(t.val);
        if(t.left == null) {
            if(t.right == null) {
                return;
            }else{
                sb.append("()");
            }
        }else{
            sb.append("(");
            tree2strChild(t.left,sb);
            sb.append(")");
        }
        //以上代码是递归前t的位置
        if(t.right == null) {
            return;
        }else{
            sb.append("(");
            tree2strChild(t.right,sb);
            sb.append(")");
        }

    }

    public String tree2str(TreeNode t) {
        StringBuilder sb = new StringBuilder();

        tree2strChild(t,sb);

        return sb.toString();
    }
}
     */
}
