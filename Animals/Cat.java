package Animals;

public class Cat extends Animal {
    
    public Cat() {
        super(7);
        System.out.println("A cat has been created.");
    }

    public void eat() {
        System.out.println("A cat is eating.");
    }

    // Override the Sleep method in Animal
    public void sleep() {
        System.out.println("A cat is sleeping.");
    }
    // Method
    public void meow() {
        System.out.println("A cat meows!");
    }

    // Method
    public void prance() {
        System.out.println("A cat is prancing.");
    }
}
