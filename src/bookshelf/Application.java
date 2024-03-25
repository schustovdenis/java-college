package bookshelf;

import bookshelf.books.Author;
import bookshelf.books.Book;
import bookshelf.books.Shelf;

public class Application {
    public static void main(String[] args) {
        Author author1 = new Author("Оскар", "Уайльд");
        Author author2 = new Author("Джек", "Лондон");
        Author author3 = new Author("Александр", "Дюма");


        Book book1 = new Book("Соловей и роза");
        book1.setPageCount(50);
        book1.setAuthor(author1);

        Book book2 = new Book("Мартин Иден");
        book2.setPageCount(50);
        book2.setAuthor(author2);

        Book book3 = new Book("Три мушкетера");
        book3.setPageCount(50);
        book3.setAuthor(author3);

        Shelf shelf1 = new Shelf(2, "белый");
        Shelf shelf2 = new Shelf(1, "черный");
        shelf1.addBook(book1);
        shelf1.addBook(book2);
        shelf2.addBook(book3);
    }
}
