public class Book {
    private String title;
    private String autor;
    private int publicationYear;

    public Book(String title, String autor, int publicationYear) {
        this.title = title;
        this.autor = autor;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Tytul: " + title + " Autor: " + autor + " Rok produkcji: " + publicationYear;
    }
}
