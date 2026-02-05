public class Book {
    // Variable Delcaration
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    // Constructor for Object
    public Book(String title, String author, String isbn, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    // "Get" methods to get the variables of the object
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() {return available; }

    // Display info method to display all information about a book
    public void displayInfo() {
        System.out.print("Book Information\n\nBook Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nISBN: " + getIsbn() + "\nIs available to check out: ");
        if(available == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}