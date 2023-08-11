#include <stdio.h>
#include <stdlib.h>

struct TreeNode {
    int val;
    struct TreeNode* left;
    struct TreeNode* right;
     struct TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};

void preorderTraversal(TreeNode* root) {
    if (root == nullptr) {
        return;
    }
 
    preorderTraversal(root->left); // 递归遍历左子树
    preorderTraversal(root->right); // 递归遍历右子树
    printf("%d ", root->val); // 访问根节点
}

int main() {
    // 创建二叉树
    TreeNode* root = (TreeNode*)malloc(sizeof(TreeNode));
    root->val = 1;
    root->left = (TreeNode*)malloc(sizeof(TreeNode));
    root->left->val = 2;
    root->right = (TreeNode*)malloc(sizeof(TreeNode));
    root->right->val = 3;
    root->left->left = (TreeNode*)malloc(sizeof(TreeNode));
    root->left->left->val = 4;
    root->left->right = (TreeNode*)malloc(sizeof(TreeNode));
    root->left->right->val = 5;
    root->right->left = (TreeNode*)malloc(sizeof(TreeNode));
    root->right->left->val = 6;
    root->right->right = (TreeNode*)malloc(sizeof(TreeNode));
    root->right->right->val = 7;

    // 中序遍历二叉树并输出结果
    printf("Preorder traversal of binary tree is: ");
    preorderTraversal(root);
    printf("\n");

    // 释放二叉树内存空间
    free(root->left);
    free(root->right->left);
    free(root->right->right);
    free(root->right);
    free(root);

    return 0;
}