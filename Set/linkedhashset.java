package Set;

import java.util.Set;

import java.util.LinkedHashSet;

public class linkedhashset {
 public static void main(String[] args) {
	  
	 //unique but preserve order
	 LinkedHashSet lhs=new LinkedHashSet();
	 lhs.add(22);
	 lhs.add(22);
	 lhs.add(21);
	 lhs.add(20);
	 System.out.println(lhs);
	
}
}
