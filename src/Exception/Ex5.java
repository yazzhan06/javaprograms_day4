package Exception;

import java.util.*;

public class Ex5 {

public static void main(String[]args) {

	Queue<Integer> q1=new LinkedList<>();

	q1.add(100);

	q1.add(200);

	System.out.println(q1);

	System.out.println(q1.peek());

	//set

	//hash set

	HashSet<String> s1=new HashSet<>();

	s1.add("aardra");

	s1.add("arun");

	System.out.println(s1);

	//tree set

	TreeSet<String> s2=new TreeSet<>();

	s2.add("iniyal");

	s2.add("madhu");

	s2.add("arish");

	s2.add("gokul");

	System.out.println(s2);

}

}
