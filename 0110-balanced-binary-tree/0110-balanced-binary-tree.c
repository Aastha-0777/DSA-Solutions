/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

int checkHeight(struct TreeNode* root) {

    if (root == NULL) {
        return 0;
    } // end of if
    int leftHeight = checkHeight(root->left);
    if (leftHeight == -1) {
        return leftHeight;
    } // end of if
    int rightHeight = checkHeight(root->right);
    if (rightHeight == -1) {
        return rightHeight;
    } // end of if
    if (leftHeight - rightHeight > 1 || rightHeight - leftHeight > 1)
        return -1;

    return (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;
}

bool isBalanced(struct TreeNode* root) { return checkHeight(root) != -1; }