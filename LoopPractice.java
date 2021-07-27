public class LoopPractice {
    
    //Function for While Loop
    public static void practiceWhileLoop() {
        // variable
        int x = 0;

        while(x < 5) {
            System.out.println("The value of x is " + x);
            x++;
        }
        System.out.println("This is the end of the While Loop.");
    }

    //Function for Do While Loop
    public static void practiceDoWhileLoop() {
        int x = 0;
        do {
            System.out.println("The value of x is " + x);
            x++;
        } while (x < 10);
        System.out.println("This is the end of the Do While Loop.");
    }

    public static void practiceForLoop() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.println("("+x+","+y+")");
            }
        }
        System.out.println("This is the end of the For Loop.");
    }

    public static void main(String[] args) {
        practiceWhileLoop();
        practiceDoWhileLoop();
        practiceForLoop();
    }
}
