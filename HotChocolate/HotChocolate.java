package HotChocolate;

import java.util.concurrent.TimeUnit;

public class HotChocolate {

    // creating maximum temparature for too hot
    public static final double tooHot = 185;

    // creating minimum tempature for too cold
    public static final double tooCold = 160;

    // methods must throw an error or else the error will show up as a syntax issue
    // within code
    public static void drinkHotChocolate(double cocoaTemp) throws TooColdException, TooHotException {
        if (cocoaTemp >= tooHot) {
            throw new TooHotException();
        } else if (cocoaTemp <= tooCold) {
            throw new TooColdException();
        }
    }

    // main method
    public static void main(String[] args) throws InterruptedException {
        // Sets current temp using the double "currentCocoaTemp"
        double currentCocoaTemp = 150;

        boolean wrongTemp = true;
        while (wrongTemp) {
            // Try-Catch loop where we try to drink the hot chocolate using
            // "drinkHotChocolate"
            try {
                drinkHotChocolate(currentCocoaTemp);
                System.out.println("That cocoa was good");
                wrongTemp = false;
            }
            // if it is too hot we send an error that states it is too hot
            catch (TooHotException e1) {
                System.out.println("That's Too Hot!");
                currentCocoaTemp = currentCocoaTemp - 5;
            }
            // if it is too cold we send an error that states it is too cold
            catch (TooColdException e2) {
                System.out.println("That's Too Cold!");
                currentCocoaTemp = currentCocoaTemp + 5;
            }
            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("And it's gone");
    }
}
