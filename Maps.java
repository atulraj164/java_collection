package java_collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

//Map is an interface that stores data in (key → value) form
//Map->HashMap
public class Maps {
     public void mapit() {
    	 Map<String,Integer>hm=new HashMap<>();
    	 hm.put("raj", 5);
    	 hm.put("kaka", 9);
    	 hm.put("shaka",2);
    	 
    	 System.out.println(hm);
    	 
    	 //keyset gives set of all the key in hm
    	 System.out.println(hm.keySet());
    	 
    	 for(String keys:hm.keySet()) {
    		 if(keys.equals("kaka")) {
    			 System.out.println(hm.get(keys));
    		 }
    	 }
    	 
    	 /*HashMap is not synchronized; Hashtable is synchronized (thread-safe)
    	 HashMap is faster; Hashtable is slower due to synchronization
    	 HashMap allows one null key and multiple null values; Hashtable allows no null key or value
    	 HashMap is modern (introduced in JCF); Hashtable is legacy class
    	 HashMap uses Iterator; Hashtable uses Enumeration + Iterator
    	 Both store key–value pairs and use hashing
    	 */
    	 
    	 Map<Integer,String>ht=new Hashtable<>();//synchronized ,thread safe,slow,no null value
    	 ht.put(9, "ss");
    	 ht.put(6, "as");
    	 ht.put(2, "ka");
    	 
    	 ht.keySet();
    	 System.out.println(ht);
     }
}
