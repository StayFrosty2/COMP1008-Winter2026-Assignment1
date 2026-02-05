import java.util.Scanner;
import java.util.ArrayList;

public class libraryBookManagement {
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);

        String userInput;
        boolean systemActive = true;
        int userInt;

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
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
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
