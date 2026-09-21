package Map;
import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapWithComparator {
    public static void main(String[] args) {
		
	
	
	
	//treemap apply sorting on keys not value
	
	TreeMap<Integer,String> map=new TreeMap<>();
	map.put(50, "A");
	map.put(20, "b");
	map.put(10, "c");
	System.out.println(map);
	
	//tree map woth comparator reverse sorting key
	
	TreeMap<Integer,String> revmap=new TreeMap<>(new Comparator <Integer>() {
		@Override
		public int compare(Integer a,Integer b) {
			return Integer.compare(b, a);
		}
	});
	revmap.put(50, "A");
	revmap.put(20, "b");
	revmap.put(10, "c");
	System.out.println(revmap);
	
    //with lamda function
    TreeMap<Integer,String> reversemap=new TreeMap<>((a,b)->Integer.compare(b, a));
    reversemap.put(50, "A");
    reversemap.put(20, "b");
    reversemap.put(10, "c");
    System.out.println(revmap);

    }
}
