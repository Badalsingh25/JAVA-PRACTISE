import java.util.*;

class solution{
    public static void main(String[] args) {

    // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
    // PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
    // PriorityQueue<Integer> pq = new PriorityQueue<>();

    pq.add(30);
    pq.add(10);
    pq.add(50);
    pq.add(5);

    while(!pq.isEmpty()){
        System.out.println(pq.poll());
    }
    // System.out.println(pq.peek());
 }
} 
