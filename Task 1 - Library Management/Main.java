package com.company;

import java.util.ArrayList;
import java.time.LocalDateTime;


class Book{
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", author='" + author + '\'' + '}';
    }
}

class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The" + " " + book + " has been added to the library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("The " + book + " has been issued from the library to " + issued_to + " on " +  LocalDateTime.now());
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The" + " " + b + " has been returned on " + LocalDateTime.now());
        this.books.add(b);
    }

}
public class Main {
    public static void main(String[] args) {

        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("History of DJ Sanghvi", "BE");
        bk.add(b1);

        Book b2 = new Book("Clubs in DJ", "TE");
        bk.add(b2);

        Book b3 = new Book("Committees in DJ", "SE");
        bk.add(b3);

        Book b4 = new Book("Teams in DJ", "FE");
        bk.add(b4);

        MyLibrary l = new MyLibrary(bk);
        l.addBook(new Book("DJ UNICODE", "Interviewer"));
        System.out.println("Current Books Status " + l.books + "\n");

        l.issueBook(b3, "Devang - 60004200158" );
        System.out.println("Current Books Status " + l.books + "\n");

        l.returnBook(b3);
        System.out.println("Current Books Status " + l.books + "\n");

        l.issueBook(b1, "Rajiv - 60004200198" );
        System.out.println("Current Books Status " + l.books + "\n");

        l.issueBook(b2, "Narendra - 60004200232" );
        System.out.println("Current Books Status " + l.books + "\n");

        l.returnBook(b2);
        System.out.println("Current Books Status " + l.books + "\n");
    }
}
