package Exception;

public class Ex1 {
public static void main(String[]args) {
	try {
		int num=19/0;
	}catch (ArithmeticException e) {
		System.out.println("Cannot divide by zero:"+e.getMessage());
		} finally {
			System.out.println("Excecution completed");
			
		}
}
}
