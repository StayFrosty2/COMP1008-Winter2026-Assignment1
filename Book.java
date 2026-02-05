public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    public Book(String title, String author, String isbn, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() {return available; }

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