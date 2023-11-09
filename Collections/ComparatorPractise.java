import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	int age;
	String name;
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
}
public class ComparatorPractise {
	public static void main(String[] args) {
		Comparator<Integer> com = (i, j) ->  i%10 > j%10?1:-1; //implementing compare method
		Comparator<Student> co = (i,j) -> i.age>j.age?1:-1;		//lambda expression
		
//		Comparator<Student> co = new Comparator<Student>() {
//			public int compare(Student i, Student j) {
//				if(i.age>j.age)
//					return 1;
//				else
//					return -1;
//			}
//		};
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(23);
		nums.add(36);
		nums.add(12);
		nums.add(30);
		Collections.sort(nums,com);
		System.out.println(nums);
		
		List<Student> studs = new ArrayList<Student>();
		studs.add(new Student(30,"Tulasi"));
		studs.add(new Student(27,"Karthi"));
		studs.add(new Student(28,"Lucky"));
		Collections.sort(studs,co);
		for(Student s: studs) {
			System.out.println(s);
		}
	}
}
