package Exception;
import java.util.*;
class Species{
	void Animal() {
		System.out.println("Domestic Animal");
	}
}
class Birds extends Species{
	void Animal() {
		System.out.println("Hello");
	}
}

public class Task2 {
public static void main(String[]Args) {
	Species s1=new Species();
	Birds b1=new Birds();
	s1.Animal();
	b1.Animal();
}
}
