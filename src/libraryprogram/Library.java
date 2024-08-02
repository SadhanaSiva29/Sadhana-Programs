package libraryprogram;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int numbooks) {
        books = new Book[numbooks];
        bookCount = 0;
    }
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full.");
        }
    }
    public void borrowBook(String title){
        for(int i=0;i<bookCount;i++){
            if(!books[i].isBorrowed()){
                books[i].borrow();
            }
            else{
                System.out.println("No such book is available in the Library.");
            }
        }
    }
    public void returnBook(String title){
        for(int i=0;i<bookCount;i++) {
            if (!books[i].isBorrowed()) {
                books[i].borrow();
                System.out.println("Book is successfully borrowed: "+books[i]);
            }
        }
    }
    public void viewBooks(){
        for(int i=0;i<bookCount;i++){
            System.out.println(books[i]);
        }
    }
}