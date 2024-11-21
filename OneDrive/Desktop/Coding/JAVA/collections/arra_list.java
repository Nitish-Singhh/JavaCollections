package collections;

import java.util.*;

public class arra_list {

    public static void main(String[] args) {
        ArrayList obj = new ArrayList<>();
        obj.add(43);
        obj.add(47);
        obj.add(67.98);
        obj.add(98);
        obj.add("Mohan");
        System.out.println(obj);
        System.out.println(obj.size());
        obj.set(3, 456);
        System.out.println(obj.get(4));
        // System.out.println(obj);
        obj.addAll(1, obj);

        ArrayList obj1 = new ArrayList<>();
        // int abc = obj1.size();
        obj1.add(34);
        obj1.add(53);
        obj1.add(85);
        obj1.add(63);
        obj1.set(0, "Sohan");
        obj.remove(1);
        System.out.println(obj1.getClass());
        // obj1.addAll(2, obj);
        // System.out.println(obj1);
        for (int i = 0; i < obj1.size(); i++) {
            System.out.println(obj1.get(i));
        }
    }
}