package java_collections;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



/* list is an interface but we created object out of it by creating an anonymous
 * class(a class with no name and overrides all the method of interface,no name, can used for 
 * class, interface and abstract class )not reusable outside the class any method written inside must allready exists 
 * */
public class Anonymous_class {
       public static void main(String [] args) {
    	   
	List cl=new List() {
		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean contains(Object o) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Iterator iterator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object[] toArray(Object[] a) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean add(Object e) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean remove(Object o) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean containsAll(Collection c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean addAll(Collection c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean addAll(int index, Collection c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean removeAll(Collection c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean retainAll(Collection c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Object get(int index) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object set(int index, Object element) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void add(int index, Object element) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Object remove(int index) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int indexOf(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int lastIndexOf(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public ListIterator listIterator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ListIterator listIterator(int index) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List subList(int fromIndex, int toIndex) {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	System.out.println(cl.show());
}}
