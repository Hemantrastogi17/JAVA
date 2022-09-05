package com.company;

import java.util.Scanner;
import java.util.Vector;


class User{
    Vector<String> books = new Vector<>();
    Vector<String> issuedBooks = new Vector<>();
    public void addBook(){
        System.out.println("Enter the name of the book that you want to add:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        books.add(name);
    }
    public void issueBook(){
        System.out.println("Enter the name of the book that you want to issue:");
        Scanner sc = new Scanner(System.in);
        String issueName = sc.nextLine();
        if(!books.contains(issueName)){
            System.out.println("Book not available.");
        }
        else {
            books.removeElement(issueName);
            issuedBooks.addElement(issueName);
        }
    }
    public void returnBook(){
        System.out.println("Enter the name of the book that you want to issue:");
        Scanner sc = new Scanner(System.in);
        String returnName = sc.nextLine();
        if(!issuedBooks.contains(returnName)){
            System.out.println("The book you are trying to return has not been issued.");
            System.out.println("Want to donate a book?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            if(choice == 1){
                books.addElement(returnName);
                System.out.println("Your donation has been accepted");
            }
            else if( choice ==2){
                System.exit(0);
            }
        }
        books.addElement(returnName);
        issuedBooks.removeElement(returnName);
    }
    public void showBooks(){
        if(books.isEmpty()) System.out.println("No books to show");
        else {
            System.out.println("Available Books:" + books);
        }
    }
}
public class Library {
    public static void main(String[] args) {
    User u = new User();
    boolean loop = true;
    while(loop){
        System.out.println("1. Add Book");
        System.out.println("2. Issue Book");
        System.out.println("3. Return Book");
        System.out.println("4. Show Available Books");
        System.out.println("5. Exit");
        System.out.println("Enter your choice:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1: u.addBook();break;
            case 2: u.issueBook();break;
            case 3: u.returnBook();break;
            case 4: u.showBooks();break;
            case 5: loop = false;System.exit(0);break;
            default:
                System.out.println("Invalid choice ! Please try again");
        }
    }
    }
}
