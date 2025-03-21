package Exception;
import java.util.*;
public class Ex4 {
	public static void main(String[]args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(100);
		list.addFirst(200);
		list.addLast(300);
	
		list.get(2);
		list.add(500);
		list.add(700);
		list.get(0);
		System.out.println(list);
	}

}
