package com.trimetrica.bookcollectiontask;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookStock;
    private String name;

    public Library(String name) {
        this.name = name;
        bookStock = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        bookStock.add(book);
    }

    public void removeBook(Book book) {
        int index = -1;
        for (int i = 0; i < bookStock.size(); i++) {
            if (bookStock.get(i).equals(book))
                index = i;
        }
        if (index != -1) {
            Book deletedBook = bookStock.get(index);
            System.out.println("Book deleted: " + deletedBook.getTitle() + " " + deletedBook.getAuthor());
            bookStock.remove(index);
        }
    }

    public void findBook(String title) {
        for (Book book : bookStock) {
            if (book.getTitle().equals(title)) {
                System.out.println("Book found: " + book.getTitle() + " " + book.getAuthor());
            }
        }
    }

    public void findBook(String title, String author) {
        for (Book book : bookStock) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                System.out.println("Book found: " + book.getTitle() + " " + book.getAuthor());
            }
        }
    }

    public int BooksNumber() {
        return bookStock.size();
    }

    public void printBooks() {
        for (Book book : bookStock) {
            System.out.println("Book: " + book.getTitle() + " " + book.getAuthor());
        }
    }
}
