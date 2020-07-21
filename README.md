## Binary Tree: Find Max

You are given a binary tree. Implement the method *findMax* which returns the maximum value. 

If the tree is null, return 0.

*E.g:*
```
        13
       /   \
      3     15
     /    /  \
    2    6   17
             /
            14
            
result : 17
```

The class `TreeNode` is available for you:

``` java
    class TreeNode {
        private int value;
        private TreeNode left;
        private TreeNode right;
        // ...
    }
```