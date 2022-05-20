package Assignment2;
import java.util.*;

//import com.sun.org.apache.xpath.internal.operations.Equals;

public class TaskUsingLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Student> list = new LinkedList<>();
		
		list.add(new Student("Ashutosh", 19, 98));
		list.add(new Student("Bipin", 19, 100));
		list.add(new Student("Dishu", 19, 99));
		list.add(new Student("Mrityunjay", 19, 100));
		
		//Task 1
		System.out.println(list);
		
		// Task2
		System.out.println(list.contains(new Student("Ashutosh", 19, 98)));
		
		// Task3
		list.remove(new Student("Mrityunjay", 19, 100));
		System.out.println(list);
		
		// Task4
		System.out.println("Number of Studnet in the list "+list.size());
		
	}
	
}

class Student{
	
	Student(String name, int age, int mark){
		this.name = name;
		this.age = age;
		this.mark = mark;
	}
	
	String name;
	int age;
	int mark;
	
	public String toString() {
		return "Name: "+name+"\nAge: "+age+"\nMarks Obtain: "+mark;
	}
	
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		else if(obj==this) {
			return true;
		}
		else {
			return this.name.equals( ((Student) obj).name ) && (this.age==( ((Student) obj).age )) && (this.mark==( ((Student) obj).mark ));
		}
	}
	
}