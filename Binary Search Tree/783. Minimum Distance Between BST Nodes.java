/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    void inorder(TreeNode root,  ArrayList<Integer> al){
        if(root == null)return;

        inorder(root.left, al);
        al.add(root.val);
        inorder(root.right, al);
    }

    public void min(TreeNode root, int ans[], int prev[]){
        if(root == null)return;

        min(root.left, ans, prev);

        if(root.val - prev[0] < ans[0] && prev[0] != Integer.MIN_VALUE)ans[0] = root.val - prev[0];

        prev[0] = root.val;

        min(root.right, ans, prev);

    }

    public int minDiffInBST(TreeNode root) {

        // // Ist method which uses extra space and an extra traversal

        // ArrayList<Integer> al = new ArrayList();
        // inorder(root, al);

        // int ans = Integer.MAX_VALUE;
        // // System.out.println(al);
        // for(int i = 0; i < al.size() - 1; i++){
        //     ans = Math.min(al.get(i + 1) - al.get(i), ans);
        // }

        // return ans;


        int ans[] = new int[1];
        ans[0] = Integer.MAX_VALUE;
        int prev[] = new int[1];
        prev[0] = Integer.MIN_VALUE;

        min(root, ans, prev);

        return ans[0];

    }
}
