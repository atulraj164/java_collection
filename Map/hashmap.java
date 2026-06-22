package Map;


import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class hashmap {
  public static void main(String[] args) {
	HashMap map =new HashMap();
	
	 map.put(101, "Atul");
     map.put(102, "Rahul");
     map.put(103, "Aman");

     System.out.println(map);
     
     System.out.println(map.get(103));
    map.replace(103, "jay");
    System.out.println(map);
    
     //Entry intraface inside map and its method
    
    Iterator it=map.entrySet().iterator();
    while(it.hasNext()) {
    	Entry ey=(Entry) it.next();
    	if(ey.getKey().equals(101)) {
    		ey.setValue("Atul Raj");
    	}
    	
    }
    System.out.println(map);
   
    
}
}
