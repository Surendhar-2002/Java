package Practice;

import java.util.*;


public class ListPrac {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();

        // list.add(8);
        // list.add(9);
        // list.add(1);

        // System.out.println(list.remove(2));
        // System.out.println(list);
        
        List<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println(list);

        list.addFirst("HTML");
        list.addLast("SQL");

        System.out.println(list);

        list.removeFirst();
        System.out.println(list);


    }
}
