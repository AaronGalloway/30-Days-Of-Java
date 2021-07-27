public class Car {
    // primitive data types are integers, booleans and characters (char)
    int maxSpeed = 250; // integers must be whole numbers
    int minSpeed = 0; // a single equals sign means assignment. a double equals sign means "equal to"

    double weight = 4079.25; //doubles can hold decimals. floats can also hold decimals but are smaller than doubles

    boolean isTheCarOn = false;
    char condition = 'A'; // characters can only be a single character. characters have single quotes
    String nameOfCar = "Grover"; // strings have double quotes.

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;

    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;
    // everything above, all the variables, are instance variables

    public Car() {

    }

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        // customMinSpeed is the parameter
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;

    }

    // Getters And Setters
    
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }

    public int getMinSpeed() {
        return this.minSpeed;
    }
    
    public double getWeight() {
        return this.weight;
    }

    public boolean isTheCarOn() {
        return this.isTheCarOn;
    }

    public void printVariables() {
        // "public" is the scope of the function
        // "void" is a return type. This is void because it does not return anything
        System.out.println("The Maxmimum speed is " + maxSpeed); // "println" prints to a single line
        System.out.println("The Minimum speed is " + minSpeed);
        System.out.println("The vehicle wieght is " + weight);
        System.out.println("Is the car on? : " + isTheCarOn);
        System.out.println("Grade of car condition: " + condition);
        System.out.println("Name Of Car: " + nameOfCar);
        System.out.println("Number Of People In Car: " + numberOfPeopleInCar);
    }

    public void upgradeMaxSpeed() {
        setMaxSpeed(getMaxSpeed() + 10);
    }

    public void getIn() {
        if (numberOfPeopleInCar < maxNumberOfPeopleInCar) {
            numberOfPeopleInCar++;
            System.out.println("Someone Got In");
        } else {
            System.out.println("The Car Is Full! " + numberOfPeopleInCar + " = " + maxNumberOfPeopleInCar);
        }
    }

    public void getOut() {
        // if ther are people in the car
        if (numberOfPeopleInCar > 0) {
            // tell someone to get out
            numberOfPeopleInCar--;
        } else {
            // there aren't any people in the car
            System.out.println("Nobody is in the car!");
        }
    }

    public double howManyMilesToEmpty() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

    public void turnTheCarOn() {
        // if the car is not on
        if (isTheCarOn == false) {
            // turn the car on
            // isTheCarOn automatically is set to false based on the class parameters
            isTheCarOn = true;
        } else {
            // otherwise print out the fact it is on
            System.out.println("The car is already on");
        }
    }
    public static void main(String[] args) {
        Car grover = new Car();
        grover.getOut();
        grover.getOut();
        grover.getIn();
        grover.getIn();
        grover.getIn();
        grover.getIn();
        grover.getIn();
        grover.getIn();
        grover.getIn();
        grover.turnTheCarOn();
        grover.turnTheCarOn();
    }
}
