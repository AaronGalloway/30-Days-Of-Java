import java.util.Arrays;

public class ArrayPractice {
    
    // "<E>" can be anything (int, String, Boolean)
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Location ID:   0,1,2,3,4
        // Example Array [0,5,2,6,7]

        // First way to declare arrays
        Integer[] intArray1;

        //Second way to declare arrays
        Integer[] intArray2 = new Integer[4];

        //Third way to declare arrays
        Integer[] intArray3 = {5,0,2,6,7};

        String[] shoppingList = {"bananas", "apples", "celery"};

        // Setting variables in an array
        intArray2[0] = 10; // Set the first number in array 2 to the number 10.
        intArray2[1] = 20;
        intArray2[2] = 30;
        intArray2[3] = 40;

        //Print out arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println();

        // Custom print out arrays
        printArray(intArray2);
        printArray(intArray3);
        System.out.println();

        // Retrieve objects
        System.out.println(intArray2[3]);
        System.out.println();

        //Given Functions
        Arrays.sort(intArray3); // Sorting Arrays
        printArray(intArray3);
        
        System.out.println("Special For Loop:");
        // Special for loop: foreach
        for (String s : shoppingList) {
            System.out.println(s);
        }
    }
}
