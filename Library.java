import java.util.Scanner; //import Scanner class to use non-static methods and to take user input

//The Library class represents a simple library management system.It allows users to add new books, borrow books, return books, and view available books.
import java.util.Scanner;

public class Library {
    int bookno;
    String bookname;
    int total = 0;

    void add(Scanner sc) {
        System.out.println("Enter book name: ");
        bookname = sc.nextLine(); // Use nextLine() to handle book names with spaces
        total++;
        System.out.println("New book added Successfully...");
    }

    void borrow(Scanner sc) {
        if (total > 0) {
            System.out.println("Enter book name: ");
            bookname = sc.nextLine(); // Use nextLine() to handle book names with spaces
            total--;
            System.out.println("Congratulations... you have borrowed " + bookname + " book");
        } else {
            System.out.println("Sorry, books are not in stock");
        }
    }

    void returnbook(Scanner sc) {
        System.out.println("Enter book name: ");
        bookname = sc.nextLine(); // Use nextLine() to handle book names with spaces
        total++;
        System.out.println("Process done successfully... Thanks for cooperation");
    }

    void disp() {
        System.out.println("Total books in Library: " + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library book = new Library();

        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Add new");
            System.out.println("2. Borrow");
            System.out.println("3. Return book");
            System.out.println("4. View all");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline character after reading integer input

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println("Book adding Section:");
                    book.add(sc);
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Book borrowing Section:");
                    book.borrow(sc);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Book returning Section:");
                    book.returnbook(sc);
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Total available books:");
                    book.disp();
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Thank you... Program exit successfully");
                    break;
                default:
                    System.out.println();
                    System.out.println("Wrong option");
                    break;
            }
            System.out.println();
        } while (choice != 5);
        
        sc.close(); // Close the Scanner object when done
    }
}
