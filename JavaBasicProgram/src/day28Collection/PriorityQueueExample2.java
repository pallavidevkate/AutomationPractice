package day28Collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample2 {

	public static void main(String[] args) {
		Queue queue = new PriorityQueue();
		System.out.println("Size: "+ queue.size());
		System.out.println("Elements of Queue: "+ queue);
		System.out.println("head Elements of the Queue using peak():"+ queue.peek());
		System.out.println("head Element of the queue using element():"+ queue.element());

	}

}
