package libraryprogram;
public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;
    public Book(String title,String author){
        this.title=title;
        this.author=author;
        this.isBorrowed=false;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public boolean isBorrowed() {
        return isBorrowed;
    }
    public void borrow(){
        isBorrowed=true;
    }
    public void returnBook(){
        isBorrowed=false;
    }
    public String toString(){
        return "Book{"+"title: '"+title+"\n"+"author: "+"\nisBorrowed: "+isBorrowed+'}';
    }
}