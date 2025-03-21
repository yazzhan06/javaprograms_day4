package Exception;


class Pet {
    void bark() {
        System.out.println("I have the best pet");
    }
}


class Sneha extends Pet {
    @Override
    void bark() {
        System.out.println("I have the best dog");
        super.bark(); 
    }
}

public class Task5 {
    public static void main(String[] args) {
        
        Pet p1 = new Sneha();
        p1.bark(); 
    }
}

