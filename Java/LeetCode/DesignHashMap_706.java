// ! HashTable

package LeetCode;

class MyHashMap {

    private int hashMap[];

    public MyHashMap() {
        hashMap = new int[1000001];
        for (int i = 0; i < 1000001; i++)
            hashMap[i] = -1;
    }

    public void put(int key, int value) {
        hashMap[key] = value;
    }

    public int get(int key) {
        return hashMap[key];
    }

    public void remove(int key) {
        hashMap[key] = -1;

    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

public class DesignHashMap_706 {
    public static void main(String[] a) {
        MyHashMap obj = new MyHashMap();
        obj.put(0, 1);
        obj.put(1, 2);
        obj.put(3, 4);
        obj.put(6, 5);
        obj.remove(3);
        System.out.println(obj.get(6));
    }
}
