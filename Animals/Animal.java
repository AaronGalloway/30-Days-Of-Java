package Animals;

// Animal is now an abstract class
public abstract class Animal {

    private int age; // VS private int age;

    public Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created!");
    }

    // Abstract Method
    public abstract void eat();

    // Non-Abstract Method
    public void sleep() {
        System.out.println("An animal is sleeping.");
    }

    // Getters
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat();
        c.eat();
        d.sleep();
        c.sleep();

        // Casting
        Object dog = new Dog();
        Dog realDog = (Dog) dog;
        realDog.eat();
        realDog.ruff();

        // More Casting
        Object str = "est";
        // On the right side of the equals sign you put the datatype in parenthesis
        String realS = (String) str;
        realS.getBytes();

        // What happens when...
        Dog doggy = new Dog();
        if (d instanceof Animal) {
            Animal animal = (Animal) doggy;
            animal.sleep();
        }
        doggy.sleep();
    }
    
}
