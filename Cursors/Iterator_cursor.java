package Cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_cursor {
        public static void main(String[] args) {
			
        	List<Integer> l1=new ArrayList<>();
        	l1.add(1);
        	l1.add(1);
        	l1.add(3);
        	l1.add(4);
        	l1.add(5);
        	l1.add(6);
        	
        	Iterator<Integer> iterate=l1.iterator();
        	
        	while(iterate.hasNext()) {
        		if(iterate.next()%2!=0) {
        			iterate.remove();
        		}
        	}
        	System.out.println(l1);
		}
}
