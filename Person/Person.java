package Person;

// Must import the enum in order for things to work
import static Person.HairColor.*;

public class Person {
    
    // Hair color must actual be a color and not something like "bubbles." Introducing Enums
    HairColor hairColor = BLACK;

    // Constructor that creates a new person
    public Person() {
    
    }

    public static void main(String[] args) {
        // Testing aliasing with Peter Parker as Spiderman
        Person peterParker = new Person();
        Person spiderMan = peterParker;

        // Changing the default black hair to pink hair. Will Spiderman's hair change too?
        peterParker.hairColor = PINK;

        System.out.println("Hair Color of Peter Parker: " + peterParker.hairColor);
        System.out.println("Hair Color of Spiderman: " + spiderMan.hairColor);
    }
}
