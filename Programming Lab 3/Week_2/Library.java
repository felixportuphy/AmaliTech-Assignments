// Felix Portuphy
import java.util.ArrayList;

public class Library {


   private String libraryAddress;
   private static final String openHours = "9am";
   private static final String closeHours = "5pm";
   private ArrayList<Book> books;


    public Library(String libraryAddress) {
        this.libraryAddress = libraryAddress;
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public  void printAddress(){
        System.out.println(getLibraryAddress());
    }

    public static void printOpeningHours(){
        System.out.println("Libraries are open daily from "+openHours+" to "+closeHours);
    }


    public void borrowBook(String title) {
        int found = 0;
        for (Book i : books) {
            if (i.getTitle().equals(title)) {
                if (found == 0) {
                    found = 1;
                }
                if (!i.isBorrowed()) {
                    i.borrowed();
                    found = 2;
                    // break;
                }

            }
        }

        switch (found) {
            case 0:
                System.out.println("Sorry, book is not found in catalog");
                break;
            case 1:
                System.out.println("Sorry, this book is already borrowed");
                break;
            case 2:
                System.out.println("You successfully borrowed " + title);
                break;
        }
    }

     public void printAvailableBooks(){
        boolean bookAvailability = false;
        for(Book i: books){
            if( !i.isBorrowed()){
                System.out.println(i.getTitle());
                bookAvailability = true;
            }
        }
        if(!bookAvailability){
            System.out.println("No book in catalog");
        }
     }

     public void returnBook(String title){
         boolean found = false;
         for (Book i: books) {
             if(i.getTitle().equals(title) && i.isBorrowed()){
                 i.returned();
                 found = true;
                 break;
             }
         }
         if(found){
             System.out.println("You have successfully returned " +title);
         }
     }


    public String getLibraryAddress() {
        return libraryAddress;
    }


    // main method
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");
        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
        // Print opening hours and the addresses
        System.out.println("Library hours:");
        Library.printOpeningHours();

        System.out.println();
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();
        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries

        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library

        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }


}
