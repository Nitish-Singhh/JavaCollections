package collections;

import java.util.ArrayList;
public class arraylistt {

    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList();
        arr.add(43);
        arr.add(65);
        arr.add(34);
        arr.add((int) 54.6);
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}