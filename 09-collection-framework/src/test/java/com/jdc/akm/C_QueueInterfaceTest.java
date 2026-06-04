package com.jdc.akm;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import org.junit.jupiter.api.Test;

public class C_QueueInterfaceTest {

	private Queue<String> queue;
	
	@Test
	void useLinkList() {
		
//		queue = new LinkedList<String>();
//		addVsOffer(queue, "Link List");
//		removeVsPoll(queue, "Link List");
//		elementVsPeek(queue, "Link List");
//		show();
				
//		queue = new PriorityQueue<String>(2);
//		addVsOffer(queue, "Priority Queue");
//		removeVsPoll(queue, "Priority Queue");
//		elementVsPeek(queue, "Priority Queue");
//		show();
		
		queue = new ArrayBlockingQueue<String>(4);
		addVsOffer(queue, "ArrayBlockingQueue");
//		removeVsPoll(queue, "ArrayBlockingQueue");
//		elementVsPeek(queue, "ArrayBlockingQueue");
		show();
		
//		queue = new ArrayDeque<String>(2);
//		addVsOffer(queue, "ArrayDeque");
//		removeVsPoll(queue, "ArrayDeque");
//		elementVsPeek(queue, "ArrayDeque");
//		show();
	}
	
	void elementVsPeek(Queue<String> queue, String message) {
		removeVsPoll(queue, message);
		System.out.println("element : " +queue.element()); // NoSuchElement Exception
		System.out.println("Peek : " +queue.peek());
		
	}
	
	void removeVsPoll(Queue<String> queue, String message) {
		addVsOffer(queue, message);
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();
	}
	
	void addVsOffer(Queue<String> queue, String message) {
		System.out.println("====== " + message + " ======");
		queue.add("Andrew");
		queue.add("John");
		queue.offer("William");	
		queue.offer("Patrick");
		queue.add("John");
	}
	
	void show() {
		for(String s: queue) {
			System.out.println(s);
		}
		System.out.println("+++++++++++++++++++++++++++++++++++");
	}
}
