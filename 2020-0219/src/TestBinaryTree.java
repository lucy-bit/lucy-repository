/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -02 -19
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

    //插入
    public boolean insert(int key) {
        Node node = new Node(key);
        if(root == null) {
            root = node;
            return true;
        }else {
            Node cur = root;
            Node parent = null;
            //1、找叶子节点 -> 正确插入的结点
            while(cur != null) {
                parent = cur;
                if(cur.data < key) {
                    cur = cur.right;
                }else if(cur.data >key){
                    cur = cur.left;
                }else {
                    return false;
                }
            }
            //2、开始插入
            if(parent.data < key) {
                parent.right = node;
            }else {
                parent.left = node;
            }
            return true;
        }
    }
    //查找 key 二叉搜索树
    public Node search(int key) {
        Node cur = root;
        while(cur != null) {
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

    //中序遍历——
    public void inorder(Node root) {
        if(root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

    }
    //前序遍历
    public void preOrder(Node root) {
        if(root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

    }

    //删除关键字为key的结点
   /* public void remove(int key) {
        Node cur = root;
        Node parent = null;
        while(cur != null) {
            if(cur.data == key) {
                //找到删除的结点
                //删除
                removeNode(parent,cur);
                return;
            }else if(cur.data <key) {
                parent = cur;
                cur = cur.right;
            }
        }
    }*/

   //再写一遍删除关键字为key的结点
    public void remove(int key) {
        Node cur = root;
        Node parent = null;
        //找到要删除的结点
        while(cur != null) {
            parent = cur;
            if(cur.data == key) {
                //找到了，删除该节点
                removeNode(parent,cur);
            }else if(cur.data < key){
                cur = cur.right;
            }else {
                cur = cur.left;
            }
        }
    }
    public void removeNode(Node parent,Node cur) {
        //分为三种情况
        if(cur.left == null) {
            //又分为三种情况
            if(cur == root) {
                root = cur.right;
            }else if(cur == parent.left) {
                parent.left = cur.right;
            }else {
                parent.right = cur.right;
            }
        }else if(cur.right == null) {
            //同上面方法类似
            if(cur == root) {
                root = cur.left;
            }else if(cur == parent.left) {
                parent.left = cur.left;
            }else {
                parent.right = cur.left;
            }
        }else {
            //cur.left != null && cur.right != null的情况
            Node target = cur.left;
            Node targetParent = cur;
            //以找左边最大值为例
            while(target.right != null) {
                targetParent = target;
                target = target.right;
            }
            //找到了target，且target.right == null
            //替换
            cur.data = target.data;
            //删除target
            if(target == targetParent.left) {
                targetParent.left = target.left;
            }else {
                targetParent.right = target.left;
            }
        }
    }
    /*public void removeNode(Node parent,Node cur) {
        if(cur.left == null) {
            if(cur == root) {
                root = cur.right;
            }else if(cur == parent.left) {
                parent.left = cur.right;
            }else {
                parent.right = cur.right;
            }
        }else if(cur.right == null) {
            if(cur == root) {
                root = cur.left;
            }else if(cur == parent.left) {
                parent.left = cur.left;
            }else {
                parent.right = cur.left;
            }
        }else {
            //难点
            Node targetParent = cur;//要删除的真正结点的父亲结点
           //假设统一在右边找最小值
            Node target = cur.right;
            //找到target
            while(target.left != null) {
                targetParent = target;
                target = target.left;
            }

            cur.data = target.data;
            //删除target
            if()
        }
    }*/
}
