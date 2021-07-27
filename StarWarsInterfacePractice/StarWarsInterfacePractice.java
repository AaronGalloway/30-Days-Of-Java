package StarWarsInterfacePractice;

import java.util.Random;

public class StarWarsInterfacePractice {
    
    public static Character summonCharacter() {
        
        // Create a new random integer
        Random rand = new Random();

        // If the random integer is even (divisible by 2) then return an enemy to the game
        if (Math.abs(rand.nextInt()) % 2 == 0) {
            return new Enemy();
        } else {
        // If the random integer is odd then return a hero to the game    
            return new Hero();
        }
    }

    public static void main(String[] args) {
        // Creating enemies and heroes
        Enemy darthVader = new Enemy();
        Hero ObiWanKenobi = new Hero();

        // Creating the actions of the enemies and heroes
        darthVader.attack();
        ObiWanKenobi.attack();
        darthVader.heal();
        ObiWanKenobi.heal();

        // Listing the weapons used in the fight
        System.out.println("Enemy Weapon: " + darthVader.getWeapon());
        System.out.println("Hero Weapon: " + ObiWanKenobi.getWeapon());

        // Creating a random spy
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
    }
}
