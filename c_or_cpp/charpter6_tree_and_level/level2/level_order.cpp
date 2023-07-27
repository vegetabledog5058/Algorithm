#include <stdlib.h>
#include <stdio.h>
#include <vector>
#include <stdio.h>
#include "../../tools/treenode.cpp"
#include <iostream>
#include <cstdio>
#include <queue>
#include <string>
#include <stdarg.h>
using namespace std;
 
 
using  std::vector;
// vector<vector<int>> levelOrder(TreeNode *root)
// {
//     vector<vector<int>> ret;
//     if (!root)
//     {
//         return ret;
//     }

//     queue<TreeNode *> q;
//     q.push(root);
//     while (!q.empty())
//     {
//         int currentLevelSize = q.size();
//         ret.push_back(vector<int>());
//         for (int i = 1; i <= currentLevelSize; ++i)
//         {
//             auto node = q.front();
//             q.pop();
//             ret.back().push_back(node->val);
//             if (node->left)
//                 q.push(node->left);
//             if (node->right)
//                 q.push(node->right);
//         }
//     }

//     return ret;
// }

int main()
{

    printf("create tree: \t\n");
    // struct TreeNode *root = initTree();

    // vector<vector<int>> result = levelOrder(root);
     
    
    // // 验证输出是否符合预期
    // cout << "Output: " << endl;
    // for (const auto& level : result) {
    //     for (const auto& value : level) {
    //         cout << value << " ";
    //     }
    //     cout << endl;
    // }
 

}
