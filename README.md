
## Problem Description

You are given the root of a binary search tree (BST), where the values of exactly two nodes of the tree were swapped by mistake. Your task is to recover the tree without changing its structure. The challenge is to find a way to identify and swap the two nodes back to restore the BST properties.

## Solution Approach

The solution leverages a recursive approach to traverse the tree and validate its BST properties. The key idea is to use a helper function `validate`, which checks if a subtree satisfies the BST conditions. During the traversal, we also keep track of the minimum and maximum allowed values for each node, ensuring that the left child is smaller than its parent and the right child is greater.

When a node is found that violates these conditions, we swap its value with the appropriate minimum or maximum value. The solution involves minimal changes to the tree structure and ensures that the tree is restored to its correct state without altering the overall structure of the tree.

The function `recoverTree` continuously invokes `validate` until the tree is corrected.

### Time and Space Complexity

- **Time Complexity**: O(n), where n is the number of nodes in the binary search tree. This is because we perform a single traversal of all the nodes to validate and correct the tree.
  
- **Space Complexity**: O(h), where h is the height of the tree. This is due to the recursion stack used for the tree traversal. In the worst case (unbalanced tree), h can be as large as n.

For more details on the full approach, visit the [description here](https://leetcode.com/problems/recover-binary-search-tree/).
