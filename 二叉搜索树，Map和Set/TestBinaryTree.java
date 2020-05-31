/**
 * Created with IntelliJ IDEA.
 * Description:二叉搜索树
 * User: GAOBO
 * Date: 2020-02-19
 * Time: 9:04
 */

public class TestBinaryTree {

    static class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root = null;

    public boolean insert(int key) {
        Node node = new Node(key);
        if(root == null) {
            root = node;
            return true;
        }
        //1、找叶子节点--》正确插入的节点
        Node cur = root;
        Node parent = null;
        while (cur != null) {
            if(cur.data == key) {
                return false;
            }else if(cur.data < key) {
                parent = cur;
                cur = cur.right;
            }else {
                //cur.data > key
                parent = cur;
                cur = cur.left;
            }
        }
        //2、开始插入
        if(key < parent.data) {
            parent.left = node;
        }else {
            parent.right = node;
        }
        return true;
    }

    //查找   key
    public Node search(int key) {
        Node cur = root;
        while (cur != null) {
            if(cur.data == key) {
                return cur;
            }else if(cur.data < key) {
                cur = cur.right;
            }else {
                cur = cur.left;
            }
        }
        return null;
    }

    public void inorder(Node root) {
        if(root != null) {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public void preOrder(Node root) {
        if(root != null) {
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //删除关键字为key的节点
    public void remove(int key) {
        Node cur = root;
        Node parent = null;
        while (cur != null) {
            if(cur.data == key) {
                //找到了要删除的节点
                removeNode(parent,cur);
                return;
            }else if(cur.data < key) {
                parent = cur;
                cur = cur.right;
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
    }

    public void removeNode(Node parent,Node cur){

        if(cur.left == null) {
            if(cur == root) {
                root = cur.right;
            }else if(cur == parent.left){
                parent.left = cur.right;
            }else {
                parent.right = cur.right;
            }

        }else if(cur.right == null) {
            if(cur == root) {
                root = cur.left;
            }else if(cur == parent.right) {
                parent.right = cur.left;
            }else {
                parent.left = cur.left;
            }

        }else {
            Node targetParent = cur;//要删除的节点的父亲节点-》替罪羊的父亲
            //在右边找最小值
            Node target = cur.right;
            while (target.left != null) {
                targetParent = target;
                target = target.left;
            }

            cur.data = target.data;
            //target的左肯定是空的
            if(target == targetParent.left) {
                targetParent.left = target.right;
            }else {
                targetParent.right = target.right;
            }
        }

    }
}
