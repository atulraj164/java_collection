package queueu;

import java.util.PriorityQueue;

public class priorityQueue {
 public static void main(String[] args) {

	 PriorityQueue pq=new PriorityQueue();
	 System.out.println(pq);
	 
	 for(int i=0;i<10;i++) {
		 pq.offer(i);
	 }
	 System.out.println(pq);
	 
	 for(int i=0;i<11;i++) {
		 System.out.println(pq.poll());
	 }
	 System.out.println(pq);
	 for(int i=0;i<10;i++) {
		pq.offer(i);
	 }
	 for(int i=0;i<10;i++) {
		 pq.remove();
	 }
	
	 for(int i=0;i<10;i++) {
			System.out.println("peek method:- "+pq.peek());
			try {
			System.out.println("element method:- "+pq.element());
			}catch (Exception e) {
				System.out.println("element method:- Exception");
			}
		 }
}
}
