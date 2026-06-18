package Cursors;
import java.util.*;
public class Enumerator_cursor {
 public static void main(String[] args) {
 //collections are hetrogenous
	 Vector v=new Vector();
      v.addElement(3);
	  v.add(9);
	  v.add(9);
	 System.out.println(v);
	 
	 //enumeration interface 
	 
	 Enumeration <Integer> e =v.elements();
	 
	 while(e.hasMoreElements()) {
		 if((e.nextElement())%2==0) {
			 
		 }
	 }
}
}
