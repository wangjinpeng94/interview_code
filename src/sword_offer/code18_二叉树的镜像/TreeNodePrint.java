package sword_offer.code18_二叉树的镜像;

public class TreeNodePrint {

    // 前序遍历
    public static void preTraverse(TreeNode root) {
        if(root!=null){
            System.out.print(root.val+" ");
            preTraverse(root.left);
            preTraverse(root.right);
        }
    }
    // 中序遍历
    public static void inTraverse(TreeNode root) {
        if(root!=null){
            inTraverse(root.left);
            System.out.print(root.val+" ");
            inTraverse(root.right);
        }
    }

    // 后序遍历
    public static void postTraverse(TreeNode root) {
        if(root!=null){
            postTraverse(root.left);
            postTraverse(root.right);
            System.out.print(root.val+" ");
        }
    }
}