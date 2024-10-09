package com.ps;
import java.util.Scanner;
public class Main {

    static Scanner scanny = new Scanner(System.in);
    static Book[] inventory = new Book[20];

    public static void main(String[] args) {

        Book book = new Book (101121,"i dont know","Red",false,"Sami");
        Book book1 = new Book(101122, "Learning Java", "Blue", true, "Alice");
        Book book2 = new Book(101123, "Advanced Algorithms", "Green", false, "Bob");
        Book book3 = new Book(101124, "Data Structures", "Yellow", true, "Charlie");
        Book book4 = new Book(101125, "Software Design", "Purple", false, "David");
        Book book5 = new Book(101126, "Operating Systems", "Orange", true, "Eve");

        inventory[0] = book;
        inventory[1] = book1;
        inventory[2] = book2;
        inventory[3] = book3;
        inventory[4] = book4;
        inventory[5] = book5;
        int mainMenuChoice;
        do {

        System.out.println("Hello, what would you like to do?");
        System.out.println("1. View Available books");
        System.out.println("2. Show unavailable books:");
        System.out.println("3. exit");

        mainMenuChoice = scanny.nextInt();

         switch (mainMenuChoice){
            case 1:
                showAvailableBooks(inventory);
                break;
            case 2:
                showCheckedOutBooks(inventory);
                break;
            case 3:
                break;
            default:
                System.out.println("choose 1,2 or 3 honey");

        }
        } while (mainMenuChoice != 3);
         scanny.close();

    }

    public static void showCheckedOutBooks(Book[] book) {
        System.out.println("Books Currently Checked Out:");
        for (Book books : inventory) {
            if (books != null && books.isCheckedOut == true){
                System.out.println(books);
            }}
    }

    public static void showAvailableBooks(Book[] books) {
        for (Book book : inventory) {
            if (book != null && !book.isCheckedOut)
                System.out.println(book);
        }
        System.out.println("would you like to check out a book? 1 for yes 2 for no ");
        int res = scanny.nextInt();
        if (res == 1){
        checkOutABook(inventory);
        }
    }


       public static void checkOutABook( Book[] book) {

scanny.nextLine();
               System.out.println("what book? ");
               String bookRes = scanny.nextLine();

               System.out.println("You selected: " + bookRes);

                for (Book item: inventory) {
                    if (item != null && item.title.equalsIgnoreCase(bookRes)) {
                        item.isCheckedOut = true;
                        System.out.println("you checked: "+ item.title);

                        System.out.println(" Wahts your name? ");
                        String userName = scanny.nextLine();
                        item.setCheckedOutTo(userName);

                        System.out.println("Book '" + item.title + "' is now checked out to: " + item.checkedOutTo);
                        System.out.println(item);
                        break;
                    }
           }
            }

}