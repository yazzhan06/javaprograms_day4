package Exception;

class Task {
    // Overloaded method 1: Takes no arguments
    void talk() {
        System.out.println("Hello!");
    }

    // Overloaded method 2: Takes one String argument
    void talk(String message) {
        System.out.println("Message: " + message);
    }

    // Overloaded method 3: Takes two arguments (String and int)
    void talk(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Repeat " + (i + 1) + ": " + message);
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        Task t1 = new Task();

        // Call the overloaded methods
        t1.talk(); // Calls the method with no arguments
        t1.talk("Hello, world!"); // Calls the method with one String argument
        t1.talk("Java is fun!", 3); // Calls the method with two arguments
    }
}
