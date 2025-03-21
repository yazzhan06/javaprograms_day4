package Exception;
class Hello{
	void greet() {
		System.out.println("Hello");
	}
	void greet(String s1) {
	
		System.out.println(s1);
	}
}
public class Task4 {
public static void main(String[]args) {
	Hello c1=new Hello();
	c1.greet();
	c1.greet("Hello Santa");
}
}
