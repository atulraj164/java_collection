package Set;

import java.util.Set;
import java.util.HashSet;
public class hashset {
    public static void main(String[] args) {
		//implementation class for set
    	
    	//constructor 1
    	HashSet hs=new HashSet();//default capacity 16,hetrogenous data allowed
    	
    	hs.add(20);
    	hs.add(21);
    	boolean a=hs.add(20);//duplicate not allowed
    	System.out.println("a = "+ a);
    	
    	
    	hs.add(10);
    	hs.add(null);//null allowed

    	System.out.println(hs);
    	
    	//constructor 2
    	HashSet hs1=new HashSet(18);//with intial capacity,deafualt load factor=0.75 or 75
    	
    	hs1.add(22);
    	hs1.add(32);
    	hs1.forEach(i->System.out.println(i));
    	
    	//constrictor 3
    	HashSet hs2=new HashSet(15,85);//intialized capacity and load factor
    	
    	//constructor 4
    	HashSet hs3=new HashSet(hs);//creating euivalent object;
    	System.out.println(hs3);
    	
    	
    	
	}
}
