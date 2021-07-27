package Animals;

public class Dog extends Animal {

    // Constructor
    public Dog() {
        super(15); //References Animal 
        System.out.println("A dog has been created.");
    }

    // This is necessary becuase the Animal Class is abstract
    public void eat(){
        System.out.println("A dog is eating");
    }

    // Override the Sleep method in Animal
    public void sleep() {
        System.out.println("A dog is sleeping.");
    }
    
    // Method
    public void ruff() {
        System.out.println("The dog says ruff");
    }

    //Method
    public void run() {
        System.out.println("A dog is running");
    }
}
