// Felix Portuphy
public class Book {
    private String title;
    private boolean borrowed;

    // Creates a new Book
    public Book(String bookTitle) {
       this.title = bookTitle;
       this.borrowed = false;
    }



    // Marks the book as rented
    public void borrowed() {
        this.borrowed = true;
    }

    // Marks the book as not rented
    public void returned() {
         this.borrowed = false;
    }


    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        return borrowed ? true:false;
    }

    // Returns the title of the book
    public String getTitle() {
        return title;
    }


    // main method
    public static void main(String[] args) {

        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Rented? (should be false): " +
                example.isBorrowed());
        System.out.println("Rented? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Rented? (should be false): " + example.isBorrowed());

    }
}
