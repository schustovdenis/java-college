package bookshelf.books;

import java.util.Scanner;

public class Book {
    private String title;
    private int pageCount;
    private Author author;

    public Book(String title) {
        this.title = title;
    }
    public void setPageCount(int count) {
        int valueOfCount = count;
        if (valueOfCount < 10) {
            try {
                throw new IllegalArgumentException("Значение не может быть меньше 10");
            } catch (IllegalArgumentException e) {
                Scanner scanner = new Scanner(System.in);
                boolean status = true;
                while (status) {
                    System.out.print("Введите значение страниц больше 10: ");
                    valueOfCount = scanner.nextInt();
                    status = valueOfCount < 10;
                }
            }
        }
        pageCount = valueOfCount;
    }
    public int getPageCount() {
        return pageCount;
    }
    public void setAuthor(Author author) {
        if (author == null) {
            throw new IllegalArgumentException("author не может быть null");
        }
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }
}
