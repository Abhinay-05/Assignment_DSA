/*
2196. Create Binary Tree From Descriptions

You are given a 2D integer array descriptions where descriptions[i] = [parenti, childi, isLefti] indicates that parenti is the parent of childi in a binary tree of unique values. Furthermore,
->If isLefti == 1, then childi is the left child of parenti.
-?If isLefti == 0, then childi is the right child of parenti.
Construct the binary tree described by descriptions and return its root.

The test cases will be generated such that the binary tree is valid.

Example 1:
Input: descriptions = [[20,15,1],[20,17,0],[50,20,1],[50,80,0],[80,19,1]]
Output: [50,20,80,15,17,19]
Explanation: The root node is the node with value 50 since it has no parent.
The resulting binary tree is shown in the diagram.

Example 2:
Input: descriptions = [[1,2,1],[2,3,0],[3,4,1]]
Output: [1,2,null,null,3,4]
Explanation: The root node is the node with value 1 since it has no parent.
The resulting binary tree is shown in the diagram.
 
Constraints:
1 <= descriptions.length <= 104
descriptions[i].length == 3
1 <= parenti, childi <= 105
0 <= isLefti <= 1
The binary tree described by descriptions is valid.
*/

import java.util.HashMap;
import java.util.HashSet;

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
    //store every value that has passed in a hashmap with its TreeNode
    //connect TreeNode if it aready exists or create a new one to connect
    //return root node
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> hash = new HashMap<>();//store every value in the HashMap

            TreeNode connectFrom;//parent Node
            TreeNode connectTo;//child Node
        for(int[] arr : descriptions){
            int parent = arr[0];//parent value
            int child = arr[1];//child value
            boolean left = (arr[2] == 1) ? true : false;//left child or right child
            boolean containsParent = hash.containsKey(parent);//does the HashMap contains parent
            boolean containsChild = hash.containsKey(child);//does the HashMap contains child

            if(containsParent && containsChild){//parent and child already exists
                connectFrom = hash.get(parent);
                connectTo = hash.get(child);
            }
            else if(containsParent && !containsChild){//only parent exists
                connectFrom = hash.get(parent);
                connectTo = new TreeNode(child);

                hash.put(child, connectTo);//update HashMap
            }
            else if(containsChild && !containsParent){//only child exists
                connectFrom = new TreeNode(parent);
                connectTo = hash.get(child);

                hash.put(parent, connectFrom);//update HashMap
            }
            else{//neither parent nor child exists
                connectFrom = new TreeNode(parent);
                connectTo = new TreeNode(child);
                //update HashMap
                hash.put(parent, connectFrom);
                hash.put(child, connectTo);
            }

            if(left){
                connectFrom.left = connectTo;
            }
            else{
                connectFrom.right = connectTo;
            }
        }

        int root = findRoot(descriptions);//TC : O(N)
        return hash.get(root);//return root Node
    }

    private int findRoot(int[][] d){
        //TC : O(2N)
        //N -> descriptions.length
        HashSet<Integer> child = new HashSet<>();

        for(int[] arr : d){
            child.add(arr[1]);
        }
        for(int[] arr : d){
            if(!child.contains(arr[0])){
                return arr[0];
            }
        }
        return -1;
    }
}