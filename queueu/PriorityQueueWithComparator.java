package queueu;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueWithComparator {

public static  class myComparator implements Comparator<String>{
	@Override
	public int compare(String s1,String s2) {
		
		if(s1.charAt(0)>s2.charAt(0)) {
			return -1;
		}else {
			return 1;
		}
	}

}
   public static void main(String[] args) {
	   
	 PriorityQueue pq=new PriorityQueue(12, new myComparator());
	 pq.offer("atul");
	 pq.offer("raj");
	 pq.offer("ramsung");
	 System.out.println(pq);
	 
	 
}
}
