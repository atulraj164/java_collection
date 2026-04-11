package java_collections;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class Students {
	String name;
	int marks;
	public Students(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public void show() {
		System.out.println("name :" +this.name+ " marks :"+this.marks);
	}
	
}

//comparable on direct class level now only sort(Employe) will work for specified fields
class Employe implements Comparable<Employe>{
	String name;
	int salary;
	public Employe(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void show() {
		System.out.println("name :" +this.name+ " salary :"+this.salary);
	}

	@Override
	public int compareTo(Employe o1) {
		if(this.salary>o1.salary) {
			return 1;
		}else {
		return -1;
		}
	}

	
}

//comparator is an interface used write sorting logic ascendind descending etc
//used anonymous class to use the interface
//compare method compares->where 1 means swap and -1 means dont swap;
public class comparators {
        
	public static void main(String [] args) {
	List<Integer> al=Arrays.asList(1,2,39,6,8,7);
	Comparator<Integer> comp=new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			if(o1.intValue()>o2.intValue()) {
				return 1;
			}else {
			return -1;
			}
		}
	};
	Collections.sort(al,comp);
	System.out.println(al);
	
	//Lets just sort List of sudents object based on the marks
	List<Students>stud=new ArrayList<>();
    stud.add(new Students("atul",90));
    stud.add(new Students("badal",80));
    stud.add(new Students("dillip",85));
    stud.add(new Students("harsh",85));
    stud.add(new Students("vinay",85));
   
	for(Students s:stud) {
		s.show();
	}
	
	// after sorting
	 Comparator<Students> comp1=new Comparator<Students>() {//comparing logic for list

		@Override
		public int compare(Students o1, Students o2) {
			if(o1.marks<o2.marks) {
				return 1;
			}else {
			return -1;
		}
		}
	 };
	 Collections.sort(stud,comp1);//sorting
	 System.out.println("sorted");
	 for(Students s:stud) {
			s.show();
		}
	
	// comparator can also be used at class level at students by interface comparable
	//implementing  on students and ovveriding method to write logic
	 
	 System.out.println("sorted employe");
	 
	List<Employe>emp=new ArrayList<>();
	 emp.add(new Employe("atul",5000000));
	 emp.add(new Employe("raj",200000));
	 emp.add(new Employe("dilp",40000));
	 emp.add(new Employe("menon",300000));
	 Collections.sort(emp);
	 for(Employe e:emp) {
		 e.show();
	 }
		 // USING LAMDA FUNCTION
	 
	 System.out.println("using lamda");
	 Comparator <Integer> compi=(Integer i,Integer j)-> (i>j)?1: -1;
	 List<Integer> a2=Arrays.asList(1,4,3,6,8,7);
	 Collections.sort(a2,compi);
	 System.out.println(a2);
	 
	}
}
