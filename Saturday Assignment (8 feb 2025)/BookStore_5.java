package com.celcom.javalabassignment;
import java.util.ArrayList;
import java.util.List;

class Book{
	String title, author;
	long isbnNumber;


	Book(String title, String author, long isbnNumber) {
		this.title = title;
		this.author = author;
		this.isbnNumber = isbnNumber;
	}
	public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public long getIsbn() {
        return isbnNumber;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbnNumber);
    }
}
	
class BookCollection {
    private List<Book> books;

    BookCollection() {
        books = new ArrayList<>();
    }

    
    void addBook(Book book) { // Adding book to the collection
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(long isbn) {  // Removing book to the collection
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getIsbn() == isbn) {
                bookToRemove = book;
                break;
            }
        }

        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Book removed: " + bookToRemove.getTitle());
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

}


public class BookStore_5 {
	public static void main(String[] args) {
        BookCollection collection = new BookCollection();

        // Create some books with long ISBN numbers
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 9780743273565L);
        Book book2 = new Book("Three men in a boat", "George Orwell", 9780451524935L);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 9780061120084L);

        // Add books to the collection
        collection.addBook(book1);
        collection.addBook(book2);
        collection.addBook(book3);


        // Remove a book by ISBN
        collection.removeBook(9780451524935L);
	}

}
