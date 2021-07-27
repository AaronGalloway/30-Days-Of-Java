public class ExceptionsPractice {
    
    public static void main(String[] args) {
        // Try-Catch Block

        //Try Clause "Do this until we get an exception"
        try {
            int[] c = new int[6];
            System.out.println("Element 6 at index 5 = " + c[5]);
        } 
        //Catch Clause "Do this is we get (type_of_error) in the try"
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown" + e);
        } 
        //Finally Clause "Do this no matter what"
        finally {
            System.out.println("Finally clause");
        }

        System.out.println("Finally Finished Try-Catch");
    }
}
