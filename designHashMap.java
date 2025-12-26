/*
706. Design HashMap

Design a HashMap without using any built-in hash table libraries.

Implement the MyHashMap class:

->MyHashMap() initializes the object with an empty map.
->void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
->int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
->void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.
 
Example 1:

Input
["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
[[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
Output
[null, null, null, 1, -1, null, 1, null, -1]

Explanation
MyHashMap myHashMap = new MyHashMap();
myHashMap.put(1, 1); // The map is now [[1,1]]
myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
 

Constraints:
0 <= key, value <= 106
At most 104 calls will be made to put, get, and remove.
*/
import java.util.ArrayList;
import java.util.List;

class MyHashMap {

    class CustomNode{
        int K;
        int V;
        CustomNode next;

        CustomNode(int key, int value){
            this.K = key;
            this.V = value;
            this.next = null;
        }
    }

    private CustomNode[] list; 
    public MyHashMap() {
        list = new CustomNode[10];
    }
    
    public void put(int key, int value) {
        int hash = key % 10;

        //current [hash] is NULL
        if(list[hash] == null){
            list[hash] = new CustomNode(key, value);
            return;
        }

        //checking if it exists in the current [hash]
        CustomNode temp = list[hash];
        while(temp != null){
            if(temp.K == key){
                temp.V = value;
                return;
            }
            temp = temp.next;
        }

        //add a new CustomNode to the end of the [hash]
        temp = list[hash];
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new CustomNode(key,value);
    }
    
    public int get(int key) {
        int hash = key % 10;

        CustomNode temp = list[hash];
        while(temp != null){
            if(temp.K == key){
                return temp.V;
            }
            temp = temp.next;
        }
        return -1;//key does not exist
    }
    
    public void remove(int key) {
        int hash = key % 10;

        if(list[hash] == null){
            //there is no value for the corresponding hashCode of the key
            return;
        }

        CustomNode temp = list[hash];
        if(temp.K == key){
            //first element of the [hash] is the required key
            list[hash] = temp.next;
            return;
        }

        while(temp.next != null){
            if(temp.next.K == key){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */