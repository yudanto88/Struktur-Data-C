package Latihan2;

import java.util.LinkedList;
import java.util.Queue;

public class mainqueue {
    
    public void queueExample() {
        Queue queue = new LinkedList ();
        queue.add("Java");
        queue.add("Dokter");
        queue.offer("PHP");
        queue.offer("HTML");
        System.out.println("remove: " + queue.remove());
        System.out.println("element: " + queue.element());
        System.out.println("poll: " + queue.poll());
        System.out.println("peek: " + queue.peek());
    }

    public static void main(String[] args) {
        new mainqueue().queueExample();
    }
}
