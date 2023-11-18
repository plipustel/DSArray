
/** ARRAY IN JAVA
 * 
 *  @Author: Plipus Telaumbanua
 *  @LastModified: Nov 2023
 *  @Topic: ArrayList basic
 *  
 * */

import java.util.ArrayList;

class Person {
	
	String name;
	String ID;
	int age;
	
	public Person(String name, String id, int age) {
		this.name = name;
		this.ID = id;
		this.age = age;
	}
	
	public String toString() { // cannot getPerson()
		return this.ID + ", " + this.name;
	}
}


public class ArrayListBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> arrayList = new ArrayList<>();
		
		if(arrayList.isEmpty()) {
			arrayList.add("Adam");
			arrayList.add(1);
			arrayList.add('c');
			arrayList.add(true);
		}
		
//		System.out.println(arrayList.get(0));
//		System.out.println(arrayList.get(1));
//		System.out.println(arrayList.get(2));
//		System.out.println(arrayList.get(3));
//		
		Person person1 = new Person("Afrita", "01", 28);
		Person person2 = new Person("Phil", "02", 35);
		
		arrayList.add(person1);
		arrayList.add(person2);
		
		for(Object element: arrayList) {
			System.out.println(element);
		}
		
//		Person[] personList = {person1, person2};
//		
//		for (int i = 0; i < personList.length; i++) 
//		{
//			System.out.println(personList[i].getPerson());
//		}
	}

}
