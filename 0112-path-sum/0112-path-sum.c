/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
bool hasPathSum(struct TreeNode* root, int targetSum) {

    if (root == NULL) {
        return false;
    }

    if (root->left == NULL && root->right == NULL) {
        // compare targetSum with root->val
        return root->val == targetSum;
    }

    int remainingSum = targetSum - root->val;

    return hasPathSum(root->left, remainingSum) ||
           hasPathSum(root->right, remainingSum);
}