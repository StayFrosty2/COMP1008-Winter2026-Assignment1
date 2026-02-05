import java.util.Scanner;
import java.util.ArrayList;

public class libraryBookManagement {
    public static void main(String[] args) {
        // Start Scanner
        Scanner keyedInput = new Scanner(System.in);

        // Boolean used to run the main loop and search loop
        boolean systemActive = true;
        boolean searching;
        boolean bookFound;

        // Two strings to allow the user to select an option
        String userInput;
        int userInt;

        // Short list of variables used when user is creating a new book
        String title;
        String author;
        String isbn;

        ArrayList<Book> books = new ArrayList<>();

        System.out.println("Library Main System");
        System.out.println("___________________");

        while(systemActive) {
            System.out.println("Please Select an Option:\n1. Register a new book\n2. Display all books\n3. Display all available books\n4. Search books by author\n5. Check out a book\n6. Return a book\n7. Exit\n(Enter the number of the option you'd like to select)");
            userInput = keyedInput.nextLine();
            try {
                userInt = Integer.parseInt(userInput);
            }
            catch (Exception InvalidInteger) {
                System.out.println("What you entered was not a valid option, please only enter a number between 1 and 7:");
                continue;
            }
            switch(userInt) {
                case 1: // Adds a book to the library
                    System.out.println("Enter the name of the book you would like to add:");
                    title = keyedInput.nextLine();
                    System.out.println("Enter the author of the book you are adding:");
                    author = keyedInput.nextLine();
                    System.out.println("Enter the ISBN of the book you are adding:");
                    isbn = keyedInput.nextLine();
                    Book newBook = new Book(title, author, isbn, true);
                    books.add(newBook);
                    System.out.println("Book added successfully!");
                    break;

                case 2: // Displays the information of all books
                    System.out.println("Displaying all books:\n");
                    if(books.isEmpty()) {
                        System.out.println("No Books in Library yet, returning to menu:\n");
                    }
                    else {
                        for(int i = 0; i < books.size(); i++) {
                            books.get(i).displayInfo();
                        }
                        System.out.println("All books displayed, returning to menu:\n");
                    }
                    break;

                case 3: // Displays the titles of all books marked as "available"
                    System.out.println("Displaying all available books:\n");
                    if(books.isEmpty()) {
                        System.out.println("No Books in Library yet, returning to menu:\n");
                    }
                    else {
                        for(int i = 0; i < books.size(); i++) {
                            if(books.get(i).isAvailable()) {
                                books.get(i).displayInfo();
                            }
                        }
                        System.out.println("All available books displayed, returning to menu:\n");
                    }
                    break;

                case 4: // Search for a book based on the author
                    searching = true;
                    while(searching) {
                        System.out.println("Please enter the first and last name (or pen-name) of the author you would like to search for:");
                        userInput = keyedInput.nextLine();
                        bookFound = false;

                        for(int i = 0; i < books.size(); i++) {
                            if(userInput == books.get(i).getAuthor()) {
                                bookFound = true;
                                books.get(i).displayInfo();
                            }
                        }

                        if(bookFound == false) {
                            System.out.println("Couldn't find the author you were looking for.");
                        }

                        System.out.println("\nSearch again?\n1. Yes\n2 (or anything else). No");
                        userInput = keyedInput.nextLine();

                        try {
                            userInt = Integer.parseInt(userInput);
                        }
                        catch (Exception InvalidInteger) {
                            System.out.println("What you entered was not a valid option, exiting search");
                            searching = false;
                        }

                        if(userInt == 1) {
                            continue;
                        }
                        else {
                            System.out.println("Returning to menu:");
                            searching = false;
                        }
                    }
                    break;

                case 5: // Checks out a book from the library (sets available to false)
                    searching = true;
                    bookFound = false;
                    while(searching) {
                        System.out.println("Enter the name of the book you would like to check out:");
                        userInput = keyedInput.nextLine();
                        
                        for(int i = 0; i < books.size(); i++) {
                            if(userInput == books.get(i).getTitle()) {
                                books.get(i).setAvailability(false);
                                searching = false;
                                System.out.println("Successfully checked out book!");
                            }
                        }

                        if(bookFound == false) {
                            System.out.println("Couldn't find the book you were looking for.");
                        }

                        System.out.println("\nSearch again?\n1. Yes\n2 (or anything else). No");
                        userInput = keyedInput.nextLine();

                        try {
                            userInt = Integer.parseInt(userInput);
                        }
                        catch (Exception InvalidInteger) {
                            System.out.println("What you entered was not a valid option, exiting search");
                            searching = false;
                        }

                        if(userInt == 1) {
                            continue;
                        }
                        else {
                            System.out.println("Returning to menu:");
                            searching = false;
                        }
                    }
                    break;

                case 6: // Returns a book to the library (sets available to true)
                    searching = true;
                    bookFound = false;
                    while(searching) {
                        System.out.println("Enter the name of the book you would like to return:");
                        userInput = keyedInput.nextLine();
                        
                        for(int i = 0; i < books.size(); i++) {
                            if(userInput == books.get(i).getTitle()) {
                                books.get(i).setAvailability(true);
                                searching = false;
                                System.out.println("Successfully returned book!");
                            }
                        }

                        if(bookFound == false) {
                            System.out.println("Couldn't find the book you were looking for.");
                        }

                        System.out.println("\nSearch again?\n1. Yes\n2 (or anything else). No");
                        userInput = keyedInput.nextLine();

                        try {
                            userInt = Integer.parseInt(userInput);
                        }
                        catch (Exception InvalidInteger) {
                            System.out.println("What you entered was not a valid option, exiting search");
                            searching = false;
                        }

                        if(userInt == 1) {
                            continue;
                        }
                        else {
                            System.out.println("Returning to menu:");
                            searching = false;
                        }
                    }
                    break;

                case 7: // Ends the Program
                    systemActive = false;
                    System.out.println("Shutting Down, have a nice day :)");
                    break;

                default:
                    System.out.println("That is not an available option, please input a number between 1 and 7");
                    continue;
            }
        }

        keyedInput.close();
    }
}
