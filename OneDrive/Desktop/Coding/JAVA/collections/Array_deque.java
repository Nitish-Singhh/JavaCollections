package collections;

import java.util.ArrayDeque;

public class Array_deque {
    public static void main(String[] args) {
        ArrayDeque obj = new ArrayDeque <>();
        obj.add(34);
        obj.add(55);
        obj.add(86);
        System.out.println(obj.size());
        obj.addFirst(43);
        obj.addLast(88);
        System.out.println(obj);
        // obj.clear();
        System.out.println(obj.getFirst());
        System.out.println(obj);
        obj.removeAll(obj);
        // obj.offer(500);
        obj.offerFirst(4646);
        obj.offerLast(8978);
        System.out.println(obj.offer(500));
        System.out.println(obj);
        // System.out.println(obj.removeAll(obj));
    }
}
