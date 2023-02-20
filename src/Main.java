import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Queue<Integer> queue = new PriorityQueue<>();
//        queue.add(564);
//        queue.add(598);
//        queue.add(5);
//        queue.add(53);
//        System.out.println(queue);
//        System.out.println(queue.element());
//        System.out.println(queue.peek());


//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.add(65);
//        deque.add(695);
//        deque.add(365);
//        deque.add(6515);
//        deque.add(765);
//        System.out.println(deque.getFirst());
//        System.out.println(deque.getLast());

        Map<Integer, String> map = new HashMap<>();
        map.put(5, "Dog");
        map.put(4, "Cat");
        map.put(2, "Mouse");
        System.out.println(map);
        System.out.println(map.get(4));
        for (Map.Entry<Integer, String> m: map.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());
        } // chygaruu joldoru bizge emnesin chygargybyz kelse oshonu jazabyz;
        for (Map.Entry<Integer, String> m: map.entrySet()){
            System.out.println(m.getKey());
        } // chygaruu joldoru bizge emnesin chygargybyz kelse oshonu jazabyz;
        for (Map.Entry<Integer, String> m: map.entrySet()){
            System.out.println(m.getValue());
        }// chygaruu joldoru bizge emnesin chygargybyz kelse oshonu jazabyz;
        for (Map.Entry<Integer, String> m: map.entrySet()){
            System.out.println(m);
        }// chygaruu joldoru ;

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Mouse", 5);
        map1.put("Cat", 4);
        map1.put("Dog", 2);
        System.out.println(map1);
    }
}