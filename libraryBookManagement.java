import java.util.Scanner;

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
