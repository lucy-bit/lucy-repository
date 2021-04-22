/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -22
 * Time: 21:47
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
            if (root == null) {
                return res;
            }
            findPath(root, target);
            return res;
        }
        public void findPath(TreeNode root, int target) {
            //因为FindPath中和 下面程序中都进行了判null操作，root绝对不可能为 null
            path.add(root.val);
            //已经到达叶子节点，并且正好加出了target
            if (root.val == target && root.left == null && root.right == null) {
                //将该路径加入res结果集中
                res.add(new ArrayList(path));
            }
            //如果左子树非空，递归左子树
            if (root.left != null) {
                findPath(root.left, target - root.val);
            }
            //如果右子树非空，递归右子树
            if (root.right != null) {
                findPath(root.right, target - root.val);
            }
            //无论当前路径是否加出了target，必须去掉最后一个，然后返回父节点，去查找另一条路径，最终的path肯定为null
            path.remove(path.size() - 1);
            return;
        }
    }
}
