#include <iostream>
#include <vector>
#include <queue>

using namespace std;

struct TreeNode
{
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

vector<int> largestValues(TreeNode *root)
{
    if (!root)
    {
        return {};
    }
    vector<int> res;
    queue<TreeNode *> q;
    q.push(root);
    while (!q.empty())
    {
        int len = q.size();
        int maxVal = INT_MIN;
        while (len > 0)
        {
            len--;
            auto t = q.front();
            q.pop();
            maxVal = max(maxVal, t->val);
            if (t->left)
            {
                q.push(t->left);
            }
            if (t->right)
            {
                q.push(t->right);
            }
        }
        res.push_back(maxVal);
    }
    return res;
}

int main()
{
    // 创建二叉树，这里以一个示例二叉树为例，具体实现可以根据实际情况进行修改。
    TreeNode *root = new TreeNode(3);
    root->left = new TreeNode(9);
    root->right = new TreeNode(20);
    root->right->left = new TreeNode(15);
    root->right->right = new TreeNode(7);

    vector<int> res = largestValues(root);
    for (auto &row : res)
    {
        cout << row << " ";

        cout << endl;
    }
    return 0;
}