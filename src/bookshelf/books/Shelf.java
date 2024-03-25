package bookshelf.books;

import java.util.Arrays;

public class Shelf {
    private String color;
    private Book[] books;

    public Shelf(int items, String color) {
        books = new Book[items];
        this.color = color;
    }
    public void addBook(Book book){
        for (int i = 0; i < books.length; i+= 1) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
        System.out.println("Книге автора " + book.getAuthor().getFullName() + " не хватило места на полке ");
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "color='" + color + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }

}
