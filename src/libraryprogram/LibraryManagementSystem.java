package libraryprogram;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library(5);
        library.addBook(new Book("Harry Potter","J.K. Rowling"));
        System.out.println("Available books: \n");
        library.viewBooks();
        library.borrowBook("Harry ");
    }
}
