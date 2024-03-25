package bookshelf.books;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public void printFullName() {
        System.out.println(name + " " + surname);
    }
    public String getFullName() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
