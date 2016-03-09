package Practicum3.Task4;

import java.util.Map;
import java.util.TreeMap;

/**
 * Реалізуйте структуру даних - Бінарна Купа.
 * Конструктор приймає один параметр size.
 * Методи insert(int), що працює за O(logN) i poll(), який видаляє і повертає максимальне число з купи
 * і також працює за O(logN)
 */
public class BinaryHeap {
    public static void main(String[] args) {
        BinaryHeap heap = new BinaryHeap(10);
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);
        heap.insert(5);
        heap.poll();
    }

    int size = 0;
    public BinaryHeap(int size) {
    this.size = size;
    }

    public void insert (int val) {
        TreeMap heap = new TreeMap<Integer, Integer>();
    }
    public int poll() {
    return 0;
    }
}
