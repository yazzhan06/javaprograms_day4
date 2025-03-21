package Exception;

// Base class
class Candy {
    void method1() {
        System.out.println("Tastes chocolately");
    }
}

// Subclass extending Candy
class Choco extends Candy {
    @Override
    void method1() {
        System.out.println("Tastes Sweet");
    }
}

public class Task3 {
    public static void main(String[] args) {
        // Creating an object of the base class
        Candy c1 = new Candy();
        
        // Creating an object of the subclass
        Choco s1 = new Choco();
        
        // Calling the overridden method
        s1.method1();  // This calls the method in Choco
        c1.method1();  // This calls the method in Candy
    }
}
