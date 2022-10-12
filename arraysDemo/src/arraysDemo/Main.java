package arraysDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		String Student1="Engin";
		String Student2="Derin";
		String Student3="Ahmet";
		String Student4="Salih";
		
		System.out.println(Student1);
		System.out.println(Student2);
		System.out.println(Student3);
		System.out.println(Student4);
		
		
		System.out.println("----------------------------");
		
		String[] Students = new String[4];
		Students[0] = "Engin";
		Students[1] = "Derin";
		Students[2] = "Ahmet";
		Students[3] = "Salih";
		//Students[4] = "Ali";

		for (int i = 0; i < Students.length; i++) {
			System.out.println(Students[i]);
		}
		
		for(String student:Students) {
			System.out.println(student);
		}
	}

}
