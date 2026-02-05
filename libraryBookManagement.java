import java.util.Scanner;

class Book {
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

public class libraryBookManagement {
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);

        String userInput;
        boolean systemActive = true;
        int temp;

        System.out.println("Library Main System");
        System.out.println("___________________");

        while(systemActive) {
            System.out.println("Please Select an Option:\n1. Register a new book\n2. Display all books\n3. Display all available books\n4. Search books by author\n5. Check out a book\n6. Return a book\n7. Exit\n(Enter the number of the option you'd like to select)");
            userInput = keyedInput.nextLine();
            temp = Integer.parseInt(userInput);
            break;
        }

        keyedInput.close();
    }
}
