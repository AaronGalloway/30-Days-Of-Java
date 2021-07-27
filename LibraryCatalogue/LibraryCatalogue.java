package LibraryCatalogue;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {
    
    // Creating a dictionary
    Map<String,Book> bookCollection = new HashMap<String,Book>();

    // Properties, Fields, Global Variables
    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;

    // Constructor
    public LibraryCatalogue(Map<String,Book> collection) {
        this.bookCollection = collection;
    }

    public LibraryCatalogue(Map<String,Book> collection, int lengthOfCheckoutPeriod, double initialLateFee, double feePerLateDay) {
        this.bookCollection = collection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    // Getters
    public int getCurrentDay() {
        return this.currentDay;
    }

    public Map<String,Book> getBookCollection() {
        return this.bookCollection;
    }

    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }

    public int getLengthOfCheckoutPeriod() {
        return this.lengthOfCheckoutPeriod;
    }

    public double getInitialLateFee() {
        return this.initialLateFee;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    // Setters
    public void nextDay() {
        currentDay ++;
    }

    public void setDay(int day) {
        currentDay = day;
    }

    // Instance Methods. Do not have STATIC in front of them
    // Checking out a book
    public void checkOutBook(String title) {
        Book book = getBook(title);
        if (book.getIsCheckedOut()) {
            sorryBookAlreadyCheckedOut(book);
        } else {
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It is due on day " + (getCurrentDay() + getLengthOfCheckoutPeriod())+ ".");
        }
    }

    // Returning A Book
    public void returnBook(String title) {
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
        if (daysLate > 0) {
            System.out.println("You owe the library $" + (getInitialLateFee() + daysLate * getFeePerLateDay()) + " because your book is " + daysLate + " days overdue.");
        } else {
            System.out.println("Book Returned. Thank you");
        }
    }

    // Book is not available at the time
    public void sorryBookAlreadyCheckedOut(Book book) {
        System.out.println("Sorry, " + book.getTitle() + " is already checked out. " + "It should be back on day " + (book.getDayCheckedOut() + getLengthOfCheckoutPeriod()) + ".");
    }

    // Main Method
    public static void main(String[] args) {
        Map<String,Book> bookCollection = new HashMap<String, Book>();
        Book Aaron = new Book("Aarons Book", 1234, 11111111);
        bookCollection.put("Aarons Book", Aaron);
        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkOutBook("Aarons Book");
        lib.nextDay();
        lib.nextDay();
        lib.checkOutBook("Aarons Book");
        lib.setDay(17);
        lib.returnBook("Aarons Book");
        lib.checkOutBook("Aarons Book");
    }
}
