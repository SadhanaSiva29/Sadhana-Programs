package libraryprogram;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library(2);
        System.out.println(library);
        library.addBook(new Book("Harry potter","J.K. Rowling"));
        library.addBook(new Book("wings","J.K. Rowling"));
        library.addBook(new Book("wings","J.K. Rowling"));
        library.viewBooks();
        library.borrowBook("Harry potter");

        library.returnBook("Harry potter");

    }
}