public class Book {
    String title;
    String author;
    int punlicationYear;

    public Book(String title, String author, int punlicationYear) {
        this.title = title;
        this.author = author;
        this.punlicationYear = punlicationYear;
    }

    public Book(String title, String author) {
        this(title, author, 1999);
    }
}
